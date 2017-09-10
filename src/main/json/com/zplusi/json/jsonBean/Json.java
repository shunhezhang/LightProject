package com.zplusi.json.jsonBean;

import com.google.gson.annotations.Expose;

/**
 * ======================<br/>
 * json返回bean<br/>
 * Date：2016-12-27 22:16:50<br/>
 * Author：shunhezhang<br/>
 * ======================<br/>
 * */
public class Json {
	/**
	 * 状态码：200，操作成功
	 * */
	public static int STATUS_SUCCESS = 200;
	/**
	 * 状态码：500，操作失败
	 * */
	public static int STATUS_FAIL = 500;
	/**
	 * 状态码：404，没有找到资源
	 * */
	public static int STATUS_NOT_FOUND = 404;
	
	@Expose
	private Integer status = STATUS_SUCCESS;
	@Expose
	private Object data;

	public Json() {}
	
	/**
	 * ========================<br/>
	 * @param status 返回的状态码
	 * @param data 返回的数据<br/>
	 * ========================<br/>
	 * */
	public Json(Integer status, Object data) {
		super();
		this.status = status;
		this.data = data;
	}
	
	/**
	 * ========================<br/>
	 * @param status 返回的状态码
	 * ========================<br/>
	 * */
	public Json(Integer status) {
		super();
		this.status = status;
	}
	
	/**
	 * ========================<br/>
	 * 状态码为：200，操作成功
	 * @param data 返回的数据<br/>
	 * ========================<br/>
	 * */
	public Json(Object data) {
		super();
		this.data = data;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}
