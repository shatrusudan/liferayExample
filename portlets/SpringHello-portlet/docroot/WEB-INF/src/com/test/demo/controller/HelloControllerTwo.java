package com.test.demo.controller;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller("hellocontrollertwo")
@RequestMapping(value="VIEW")
public class HelloControllerTwo {

	private Log log=LogFactoryUtil.getLog(HelloControllerTwo.class.getName());
	
	
	@RenderMapping(params="action=renderTwo")
	public String viewPage(RenderRequest req, RenderResponse res)
	{
		log.info("<----------Calling Home action two----------------->");
		return "view1";
	}
}
