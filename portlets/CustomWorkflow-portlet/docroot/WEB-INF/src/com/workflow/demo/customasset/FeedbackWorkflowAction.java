package com.workflow.demo.customasset;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.NoSuchWorkflowDefinitionLinkException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.WorkflowDefinitionLink;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.workflow.demo.model.Feedback;
import com.workflow.demo.service.FeedbackLocalServiceUtil;

import java.io.IOException;
import java.util.Date;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class FeedbackWorkflowAction extends MVCPortlet {

	public void submitFeedback(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,AddressException,PortalException,SystemException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String feedBackMessage = ParamUtil.getString(actionRequest,"feedbackMessage");
		String feedbackSubject = ParamUtil.getString(actionRequest,"feedbackSubject");
		String mailFrom = ParamUtil.getString(actionRequest, "feedbackMailFrom");
		String mailTo = ParamUtil.getString(actionRequest, "feedbackMailTo");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Feedback.class.getName(), actionRequest);
		try {
			Feedback feedback = FeedbackLocalServiceUtil.createFeedback(CounterLocalServiceUtil.increment());
			feedback.setCompanyId(themeDisplay.getCompanyId());
			feedback.setGroupId(themeDisplay.getScopeGroupId());
			feedback.setFeedbackDate(new Date());
			feedback.setFeedbackText(feedBackMessage);
			feedback.setFeedbackSubject(feedbackSubject);
			feedback.setFeedBackStatus(WorkflowConstants.STATUS_DRAFT);
			feedback.setUserId(themeDisplay.getUserId());
			feedback.setStatusByUserId(themeDisplay.getUserId());
			feedback = FeedbackLocalServiceUtil.addFeedback(feedback);
			WorkflowDefinitionLink workflowDefinitionLink = null;
			try {
				workflowDefinitionLink = WorkflowDefinitionLinkLocalServiceUtil.getDefaultWorkflowDefinitionLink(
								themeDisplay.getCompanyId(),
								Feedback.class.getName(), 0, 0);
			} catch (Exception e) {
				if (e instanceof NoSuchWorkflowDefinitionLinkException) {
					SessionMessages.add(actionRequest.getPortletSession(),
							"workflow-not-enabled");
				}
				e.printStackTrace();
			}
			// checking workflow defintion is enabled to feedback asset or not
			if (feedback != null && workflowDefinitionLink != null) {
				// add feedback asset in asset entry table
				AssetEntryLocalServiceUtil.updateEntry(themeDisplay.getUserId(), feedback.getGroupId(),Feedback.class.getName(), feedback.getFeedbackId(),
						serviceContext.getAssetCategoryIds(),
						serviceContext.getAssetTagNames());
				// start workflow instance to feedback.
				WorkflowHandlerRegistryUtil.startWorkflowInstance(
						feedback.getCompanyId(), feedback.getGroupId(),
						themeDisplay.getUserId(), Feedback.class.getName(),
						feedback.getPrimaryKey(), feedback, serviceContext);
			}
			if (feedback == null) {
				SessionErrors.add(actionRequest.getPortletSession(),
						"feedback-submit-failed");
			} else {
				SessionMessages.add(actionRequest.getPortletSession(),
						"feedback-submit-success");
			}
			
			// Send mail code here
			System.out.println("mail will be send.");
			MailMessage mailMessage = new MailMessage();
			mailMessage.setBody(feedBackMessage);
			mailMessage.setSubject(feedbackSubject);
			mailMessage.setFrom(new InternetAddress(mailFrom));
			mailMessage.setTo(new InternetAddress(mailTo));
			MailServiceUtil.sendEmail(mailMessage);
			System.out.println("mail has been sent.");
			SessionMessages.add(actionRequest.getPortletSession(),"mail-send-success");
			
			
			
		} catch (Exception e) {
			if (e instanceof NoSuchWorkflowDefinitionLinkException) {
				SessionMessages.add(actionRequest.getPortletSession(),
						"workflow-not-enabled");
			}
			e.printStackTrace();
		}
		actionResponse.setRenderParameter("mvcPath",
				"/html/workflow/feedback.jsp");
	}
}
