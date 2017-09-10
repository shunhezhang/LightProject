package com.zplusi.lightProject.bean.administrator;

/**
 * Privilege entity. @author MyEclipse Persistence Tools
 */
public class Privilege implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -2756421507457024547L;
	private Long privilegeId;
	private Long positionId;
	private Long navigationOperationId;
	private Short isDeleted;

	// Constructors

	/** default constructor */
	public Privilege() {
	}

	/** full constructor */
	public Privilege(Long positionId, Long navigationOperationId,
			Short isDeleted) {
		this.positionId = positionId;
		this.navigationOperationId = navigationOperationId;
		this.isDeleted = isDeleted;
	}

	public Long getPrivilegeId() {
		return this.privilegeId;
	}

	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}

	public Long getPositionId() {
		return this.positionId;
	}

	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}

	public Long getNavigationOperationId() {
		return this.navigationOperationId;
	}

	public void setNavigationOperationId(Long navigationOperationId) {
		this.navigationOperationId = navigationOperationId;
	}

	public Short getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Short isDeleted) {
		this.isDeleted = isDeleted;
	}

}