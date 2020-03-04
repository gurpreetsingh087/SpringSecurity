package com.oauth.authorization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OAuthController {

	@RequestMapping(value="/hello")
	public String login(){
		return "login";
	}
}
