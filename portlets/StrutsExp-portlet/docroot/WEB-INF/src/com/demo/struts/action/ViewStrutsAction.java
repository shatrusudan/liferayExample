package com.demo.struts.action;

import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ViewStrutsAction extends Action {
	
	public ActionForward render(ActionMapping mapping, ActionForm form,PortletConfig portletConfig, RenderRequest renderRequest,
			RenderResponse renderResponse) throws Exception {
		
		System.out.println("SampleStrutsAction render()..");
		return mapping.findForward("portlet.xyz.struts.view");
	}
			

}
