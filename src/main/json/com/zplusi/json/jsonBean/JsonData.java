package com.zplusi.json.jsonBean;

import com.google.gson.annotations.Expose;

/**
 * ===========================<br/>
 * json数据封装<br/>
 * Date：2016-12-27 22:24:54<br/>
 * Author：shunhezhang<br/>
 * ===========================<br/>
 * */
public class JsonData {

	@Expose
	private Integer pageChosen;
	@Expose
	private Integer recordCount;
	@Expose
	private Integer pageCount;
	@Expose
	private String info;
	@Expose
	private Object id;
	@Expose
	private Object data;
	@Expose
	private Object list;
	
	/**
	 * ===========================<br/>
	 * @param pageChosen 当前是第几页数据
	 * @param recordCount 总共获取到几条数据
	 * @param pageCount 总共有几页数据
	 * @param info 返回的提示信息
	 * @param id 返回的数据id
	 * @param data 返回的数据
	 * @param list 返回的数据列表<br/>
	 * ===========================<br/>
	 * */
	public JsonData(Integer pageChosen, Integer recordCount, Integer pageCount,
			String info, Object id, Object data, Object list) {
		super();
		this.pageChosen = pageChosen;
		this.recordCount = recordCount;
		this.pageCount = pageCount;
		this.info = info;
		this.id = id;
		this.data = data;
		this.list = list;
	}
	
	/**
	 * ===========================<br/>
	 * 用于返回列表数据<br/>
	 * @param pageChosen 当前是第几页数据
	 * @param recordCount 总共获取到几条数据
	 * @param pageCount 总共有几页数据
	 * @param list 返回的数据列表<br/>
	 * ===========================<br/>
	 * */
	public JsonData(Integer pageChosen, Integer recordCount, Integer pageCount,
			Object list) {
		super();
		this.pageChosen = pageChosen;
		this.recordCount = recordCount;
		this.pageCount = pageCount;
		this.list = list;
	}
	
	/**
	 * ===========================<br/>
	 * 用于返回数据id和相关操作信息<br/>
	 * @param info 返回的提示信息
	 * @param id 返回的数据id
	 * @param data 返回的数据<br/>
	 * ===========================<br/>
	 * */
	public JsonData(String info, Object id, Object data) {
		super();
		this.info = info;
		this.id = id;
		this.data = data;
	}
	
	/**
	 * ===========================<br/>
	 * 用于返回数据操作信息<br/>
	 * @param info 返回的提示信息<br/>
	 * ===========================<br/>
	 * */
	public JsonData(String info) {
		super();
		this.info = info;
	}
	
	/**
	 * ===========================<br/>
	 * 用于返回数据id和不定数据<br/>
	 * @param id 返回的数据id
	 * @param data 返回的数据<br/>
	 * ===========================<br/>
	 * */
	public JsonData(Object id, Object data) {
		super();
		this.id = id;
		this.data = data;
	}
	
	/**
	 * ===========================<br/>
	 * 用于返回数据id和不定数据<br/>
	 * @param id 返回的数据id<br/>
	 * ===========================<br/>
	 * */
	public JsonData(Object id) {
		super();
		this.id = id;
	}
	
	public Integer getPageChosen() {
		return pageChosen;
	}
	public void setPageChosen(Integer pageChosen) {
		this.pageChosen = pageChosen;
	}
	public Integer getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object id) {
		this.id = id;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getList() {
		return list;
	}
	public void setList(Object list) {
		this.list = list;
	}
}
