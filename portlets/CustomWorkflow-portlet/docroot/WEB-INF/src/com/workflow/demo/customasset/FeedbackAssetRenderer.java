package com.workflow.demo.customasset;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.asset.model.BaseAssetRenderer;
import com.workflow.demo.model.Feedback;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class FeedbackAssetRenderer extends BaseAssetRenderer {

	private Feedback _feedback;
	
	
	
	public FeedbackAssetRenderer(Feedback feedback) {
		_feedback = feedback;
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return Feedback.class.getName();
	}

	@Override
	public long getClassPK() {
		// TODO Auto-generated method stub
		return _feedback.getFeedbackId();
	}

	@Override
	public long getGroupId() {
		// TODO Auto-generated method stub
		return _feedback.getGroupId();
	}

	@Override
	public String getSummary(Locale locale) {
		// TODO Auto-generated method stub
		return _feedback.getFeedbackText();
	}

	@Override
	public String getTitle(Locale locale) {
		// TODO Auto-generated method stub
		return _feedback.getFeedbackSubject();
	}

	@Override
	public long getUserId() {
		// TODO Auto-generated method stub
		return _feedback.getUserId();
	}

	@Override
	public String getUserName() {
		String userName=null;
		
		try {
			userName=UserLocalServiceUtil.getUser(_feedback.getUserId()).getFullName();
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return userName;
	}

	@Override
	public String getUuid() {
		// TODO Auto-generated method stub
		return _feedback.getUuid();
	}

	@Override
	public String render(RenderRequest renderRequest,RenderResponse renderResponse, String template) throws Exception {
		
		if (template.equals(TEMPLATE_FULL_CONTENT)) {
			renderRequest.setAttribute("feedBackObject",_feedback);
			return "/html/workflow/view_feedbck.jsp";
			}
			else
			{
			return null;
			}
	}

}
