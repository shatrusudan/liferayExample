package com.first;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller(value="hellocontrollerspring")
@RequestMapping(value="VIEW")

public class HelloControllerSpring {

	@RenderMapping
	public String handleRenderRequest(RenderRequest req, RenderResponse res){
		
		return "hello";
	}
}
