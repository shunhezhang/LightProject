package com.zplusi.lightProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ======================================<br/>
 * ���Կ�����<br/>
 * Date��2016-10-30 19:59:13<br/>
 * Programmed by shunhezhang<br/>
 * ======================================<br/>
 * */
@Controller
public class TestControllor {

	@RequestMapping("/myjsp")
	public String test () {
		
		return "/test/MyJsp";
	}
}
