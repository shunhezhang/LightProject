package com.zplusi.lightProject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.google.gson.GsonBuilder;
import com.zplusi.json.jsonBean.Json;
import com.zplusi.lightProject.bean.administrator.Administrator;

/**
 * =========================<br/>
 * 控制器基类<br/>
 * Date：2016-12-25 22:29:05<br/>
 * Author：shunhezhang<br/>
 * =========================<br/>
 * */
public class BaseController {

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	
	@ModelAttribute  
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){  
		this.request = request;  
		this.response = response;  
		this.session = request.getSession();  
	}  
	
	/**
	 * ========================<br/>
	 * 向前端返回json数据，如果传入的参数都为null，则返回错误
	 * Date：2016-12-27 23:33:31
	 * @param json Json对象
	 * ========================<br/>
	 * */
	public void sendJsonBack (Json json) {
		if (null == json) {
			json = new Json(Json.STATUS_FAIL);
		}
		
		sendJsonBack(
				new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.create()
				.toJson(json));
	}
	
	/**
	 * =========================<br/>
	 * 返回json字符串<br/>
	 * @param jsonString 要返回的json字符串<br/>
	 * =========================<br/>
	 * */
	public void sendJsonBack (String jsonString) {
		
		//返回消息
		response.setContentType("text/json");
		response.setHeader("Cache-Control","no-cache");
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter pw = null;

		try {
			pw = response.getWriter();
			pw.println(jsonString);
			pw.flush();
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();

		}finally{
			if(pw != null){
				pw.flush();
				pw.close();
			}
		}
	}
	
	/**
	 * ===========================<br/>
	 * 获取当前用户
	 * @return Administrator 当前用户，如果没有当前用户，则返回null
	 * ===========================<br/>
	 * */
	public Administrator getCurrentAdministrator () {
		Object object = session.getAttribute("administrator");
		return null == object ? null : (Administrator) object;
	}
}
