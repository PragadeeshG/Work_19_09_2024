package com.test1;

public class LargeLangConfiguration {
	private Integer largeLangId;
	private String largeLangOwner;
	private boolean activeAccount;
	private Integer largeLangTypeId;
	private String largeLangType;
	private String largeLangStatus;
	private Integer largeLangDescription;
	private Integer relativeDependencies;
	private String parentPom;
	private Integer flushInterval;
	private String buildParams;
	private String status;
	private String timeToExecute;

	public LargeLangConfiguration() {

	}

	public LargeLangConfiguration(Integer largeLangId, String largeLangOwner, boolean activeAccount,
			Integer largeLangTypeId, String largeLangType, String largeLangStatus, Integer largeLangDescription,
			Integer relativeDependencies, String parentPom, Integer flushInterval, String buildParams, String status,
			String timeToExecute) {
		super();
		this.largeLangId = largeLangId;
		this.largeLangOwner = largeLangOwner;
		this.activeAccount = activeAccount;
		this.largeLangTypeId = largeLangTypeId;
		this.largeLangType = largeLangType;
		this.largeLangStatus = largeLangStatus;
		this.largeLangDescription = largeLangDescription;
		this.relativeDependencies = relativeDependencies;
		this.parentPom = parentPom;
		this.flushInterval = flushInterval;
		this.buildParams = buildParams;
		this.status = status;
		this.timeToExecute = timeToExecute;
	}

	public Integer getLargeLangId() {
		return largeLangId;
	}

	public void setLargeLangId(Integer largeLangId) {
		this.largeLangId = largeLangId;
	}

	public String getLargeLangOwner() {
		return largeLangOwner;
	}

	public void setLargeLangOwner(String largeLangOwner) {
		this.largeLangOwner = largeLangOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getLargeLangTypeId() {
		return largeLangTypeId;
	}

	public void setLargeLangTypeId(Integer largeLangTypeId) {
		this.largeLangTypeId = largeLangTypeId;
	}

	public String getLargeLangType() {
		return largeLangType;
	}

	public void setLargeLangType(String largeLangType) {
		this.largeLangType = largeLangType;
	}

	public String getLargeLangStatus() {
		return largeLangStatus;
	}

	public void setLargeLangStatus(String largeLangStatus) {
		this.largeLangStatus = largeLangStatus;
	}

	public Integer getLargeLangDescription() {
		return largeLangDescription;
	}

	public void setLargeLangDescription(Integer largeLangDescription) {
		this.largeLangDescription = largeLangDescription;
	}

	public Integer getRelativeDependencies() {
		return relativeDependencies;
	}

	public void setRelativeDependencies(Integer relativeDependencies) {
		this.relativeDependencies = relativeDependencies;
	}

	public String getParentPom() {
		return parentPom;
	}

	public void setParentPom(String parentPom) {
		this.parentPom = parentPom;
	}

	public Integer getFlushInterval() {
		return flushInterval;
	}

	public void setFlushInterval(Integer flushInterval) {
		this.flushInterval = flushInterval;
	}

	public String getBuildParams() {
		return buildParams;
	}

	public void setBuildParams(String buildParams) {
		this.buildParams = buildParams;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimeToExecute() {
		return timeToExecute;
	}

	public void setTimeToExecute(String timeToExecute) {
		this.timeToExecute = timeToExecute;
	}

}