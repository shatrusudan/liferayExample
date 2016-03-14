package com.test.demo.controller;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.CountryConstants;
import com.liferay.portal.model.ListTypeConstants;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.OrganizationConstants;
import com.liferay.portal.model.RegionConstants;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.RoleConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.service.persistence.UserUtil;
import com.liferay.portal.theme.PortletDisplay;
import com.liferay.portal.theme.ThemeDisplay;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller("hellocontroller")
@RequestMapping(value="VIEW")
public class HelloController {

	private Log log=LogFactoryUtil.getLog(HelloController.class.getName());
	
	@RenderMapping
	public String viewHomePage(RenderRequest req)
	{
		ThemeDisplay themeDisplay =  (ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);
		try{
			PermissionChecker permissionChecker=themeDisplay.getPermissionChecker();
			boolean cPer=PortletPermissionUtil.contains(permissionChecker,themeDisplay.getPortletDisplay().getId(), "TEST_PERMISSION");
			System.out.println("this is testing of permission: "+cPer);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		log.info("<----------Calling Home by default----------------->");
		return "view";
	}
	
	@RenderMapping(params="action=renderRole")
	public String renderRole(RenderRequest req, RenderResponse res)
	{
		log.info("<----------Calling Home action role----------------->");
		return "role";
	}
	
	@RenderMapping(params="action=renderOrg")
	public String renderOrg(RenderRequest req, RenderResponse res)
	{
		log.info("<----------Calling Home action Org----------------->");
		return "org";
	}
	
	@ActionMapping(params="createUser=add")
	public void createUser(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		
		System.out.println("inside createUser method()");
		
		ThemeDisplay themeDisplay =  (ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);
		
		String screenName=req.getParameter("screenName");
		
		String email=req.getParameter("email");
		
		String title=req.getParameter("title");
		String firstName=req.getParameter("firstName");
		
		String middleName=req.getParameter("middleName");
		
		String lastName=req.getParameter("lastName");
		
		String suffix=req.getParameter("suffix");
		
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		
		String jobTitle=req.getParameter("jobTitle");
		
		String password=req.getParameter("password");
		
		String sQuestion=req.getParameter("sQuestion");
		
		String sAnswer=req.getParameter("sAnswer");
		
		Locale locale=themeDisplay.getUser().getLocale();
		
		long companyId = themeDisplay.getLayout().getCompanyId();
		/*long organizationIds=themeDisplay.getScopeGroup().getOrganizationId();
		long[] roleIds=themeDisplay.getUser().getRoleIds();
		long[] userGroupIds=themeDisplay.getUser().getUserGroupIds();*/
		long[] organizationIds = new long[0];
		long[] roleIds = new long[0];
		long[] userGroupIds = new long[0];
		long[] groupId = new long[0];
		
				
		//ServiceContext serviceContext = ServiceContextFactory.getInstance(req);
		
		long creatorUserId=themeDisplay.getUserId();
		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(User.class.getName(), req);
				User user = UserLocalServiceUtil.addUser(creatorUserId, companyId, false, password, password, true, screenName, email, 0, "", locale, firstName, middleName, lastName, 0, 0, true, 1, 1, 2016, jobTitle, groupId, organizationIds, roleIds, userGroupIds, false, serviceContext);
				
				//User user = UserLocalServiceUtil.getUserByEmailAddress(themeDisplay.getCompanyId(), email);
				// userId=UserLocalServiceUtil.getUserIdByEmailAddress(themeDisplay.getCompanyId(), email);
				user.setAgreedToTermsOfUse(true);
				user.setEmailAddressVerified(true);
				user.setPasswordReset(false);
				user.setReminderQueryQuestion(sQuestion);
				user.setReminderQueryAnswer(sAnswer);
				UserLocalServiceUtil.updateUser(user);
				System.out.println("custom user created.");
			
		} catch (PortalException e) {
			
			e.printStackTrace();
		} catch (SystemException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("inside createUser method() end.");
		
	}
	
	@ActionMapping(params="createRole=add")
	public void createRole(ActionRequest req, ActionResponse res){
		
		ThemeDisplay themeDisplay =  (ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);
		Map<Locale, String> titleMap = new HashMap<Locale, String>();
		titleMap.put(Locale.ENGLISH, "Custom Test Role");
		Map<Locale, String> descriptionMap = new HashMap<Locale, String>();
		descriptionMap.put(Locale.ENGLISH, "This is custom role and assign to custom user.");
		int type = RoleConstants.TYPE_REGULAR;
		long creatorUserId=themeDisplay.getUserId();
		String roleName=req.getParameter("roleName");
		
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(User.class.getName(), req);
			Role role =RoleLocalServiceUtil.addRole(creatorUserId, Role.class.getName(), 0, roleName, titleMap, descriptionMap, type, null, serviceContext);
			System.out.println("custom role created.");
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	@ActionMapping(params="assignRole=assign")
	public void assignRole(ActionRequest req, ActionResponse res){
		long roleId=ParamUtil.getLong(req, "rId");
		long userId=ParamUtil.getLong(req, "uId");
		
		try {
			UserLocalServiceUtil.addRoleUser(roleId, userId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
	}
	
	@ActionMapping(params="createOrg=add")
	public void createOrg(ActionRequest req, ActionResponse res){
		
		ThemeDisplay themeDisplay =  (ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);
		long creatorUserId=themeDisplay.getUserId();
		String orgName=req.getParameter("orgName");
		
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(User.class.getName(), req);
			Organization org = OrganizationLocalServiceUtil.addOrganization(creatorUserId, OrganizationConstants.DEFAULT_PARENT_ORGANIZATION_ID, orgName, OrganizationConstants.TYPE_REGULAR_ORGANIZATION, RegionConstants.DEFAULT_REGION_ID, CountryConstants.DEFAULT_COUNTRY_ID, ListTypeConstants.ORGANIZATION_STATUS_DEFAULT, "custom organization", false, serviceContext);
			System.out.println("custom organization created.");
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	@ActionMapping(params="assignOrg=assign")
	public void assignOrg(ActionRequest req, ActionResponse res){
		long orgId=ParamUtil.getLong(req, "oId");
		long userId=ParamUtil.getLong(req, "uId");
		
		try {
			UserLocalServiceUtil.addOrganizationUser(orgId, userId);
			System.out.println("Assign user to Organization.");
			
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
