package com.zplusi.lightProject.controller.administrator;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zplusi.json.jsonBean.Json;
import com.zplusi.json.jsonBean.JsonData;
import com.zplusi.lightProject.bean.administrator.Administrator;
import com.zplusi.lightProject.controller.BaseController;
import com.zplusi.lightProject.service.administrator.AdministratorService;

/**
 * =======================<br/>
 * 管理员管理控制类，处理管理员管理的前后端交互
 * Date：2016-12-25 22:31:10
 * Author：shunhezhang
 * =======================<br/>
 * */
@Controller
public class AdministratorController extends BaseController{

	@Resource
	private AdministratorService administratorService;
	
	@RequestMapping("/administrator/loginPage.html")
	public String loginPage () {
		
		return "/administrator/login";
	}
	
	@RequestMapping("/administrator/add_page.html")
	public String addAdministratorForward () {
		
		return "/administrator/administrator_add";
	}
	
	@RequestMapping("/administrator/add.html")
	public String addAdministrator (Administrator administrator) {
		administratorService.addAdministrator(administrator);
		sendJsonBack(new Json(Json.STATUS_SUCCESS, new JsonData("")));
		return "";
	}
	
	@RequestMapping("/administrator/update_page.html")
	public String updateAdministratorForward () {
		Administrator administrator = new Administrator();
		administrator.setAccount("aaa");
		sendJsonBack(new Json(administrator));
		return null;
	}
}
