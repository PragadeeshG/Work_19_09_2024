package com.test1;

public class LargeLanguageData {
	private String llmCode;
	private String llmName;
	private String localenvironment;
	private String tradeenvironment;
	private String shortDescription;
	private String multillmOption;
	private String llmParams;
	private Integer uploadVersion;
	private String launchEnvironment;
	private String manageEnvironment;
	private String status;

	public LargeLanguageData() {

	}

	public LargeLanguageData(String llmCode, String llmName, String localenvironment, String tradeenvironment,
			String shortDescription, String multillmOption, String llmParams, Integer uploadVersion,
			String launchEnvironment, String manageEnvironment, String status) {
		super();
		this.llmCode = llmCode;
		this.llmName = llmName;
		this.localenvironment = localenvironment;
		this.tradeenvironment = tradeenvironment;
		this.shortDescription = shortDescription;
		this.multillmOption = multillmOption;
		this.llmParams = llmParams;
		this.uploadVersion = uploadVersion;
		this.launchEnvironment = launchEnvironment;
		this.manageEnvironment = manageEnvironment;
		this.status = status;
	}

	public String getLlmCode() {
		return llmCode;
	}

	public void setLlmCode(String llmCode) {
		this.llmCode = llmCode;
	}

	public String getLlmName() {
		return llmName;
	}

	public void setLlmName(String llmName) {
		this.llmName = llmName;
	}

	public String getLocalenvironment() {
		return localenvironment;
	}

	public void setLocalenvironment(String localenvironment) {
		this.localenvironment = localenvironment;
	}

	public String getTradeenvironment() {
		return tradeenvironment;
	}

	public void setTradeenvironment(String tradeenvironment) {
		this.tradeenvironment = tradeenvironment;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getMultillmOption() {
		return multillmOption;
	}

	public void setMultillmOption(String multillmOption) {
		this.multillmOption = multillmOption;
	}

	public String getLlmParams() {
		return llmParams;
	}

	public void setLlmParams(String llmParams) {
		this.llmParams = llmParams;
	}

	public Integer getUploadVersion() {
		return uploadVersion;
	}

	public void setUploadVersion(Integer uploadVersion) {
		this.uploadVersion = uploadVersion;
	}

	public String getLaunchEnvironment() {
		return launchEnvironment;
	}

	public void setLaunchEnvironment(String launchEnvironment) {
		this.launchEnvironment = launchEnvironment;
	}

	public String getManageEnvironment() {
		return manageEnvironment;
	}

	public void setManageEnvironment(String manageEnvironment) {
		this.manageEnvironment = manageEnvironment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}