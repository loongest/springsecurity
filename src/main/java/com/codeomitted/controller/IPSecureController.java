package com.codeomitted.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ipsecure")
public class IPSecureController {

	@RequestMapping(value = { "", "/", "/index" } , method = RequestMethod.GET)
	public String index() {
		return "secureip";
	}
	
}
