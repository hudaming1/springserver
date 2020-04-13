package org.hum.springserver.controller.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/ok")
	@ResponseBody
	public Object ztoCallback(HttpServletRequest request) {
		return "OK";
	}
}
