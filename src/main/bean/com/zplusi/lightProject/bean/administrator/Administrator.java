package com.zplusi.lightProject.bean.administrator;

import com.google.gson.annotations.Expose;


/**
 * Administrator entity. @author MyEclipse Persistence Tools
 */
public class Administrator implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7834102993127323120L;
	@Expose
	private Long id;
	@Expose
	private String account;
	@Expose
	private String password;
	@Expose
	private String name;
	@Expose
	private String gender;
	@Expose
	private Short status;
	private Short isDeleted;

	// Constructors

	/** default constructor */
	public Administrator() {
	}

	/** full constructor */
	public Administrator(String account, String password, String name,
			String gender, Short status, Short isDeleted) {
		this.account = account;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.status = status;
		this.isDeleted = isDeleted;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Short isDeleted) {
		this.isDeleted = isDeleted;
	}

}