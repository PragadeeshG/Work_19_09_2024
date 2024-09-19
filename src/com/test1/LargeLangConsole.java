package com.test1;

public class LargeLangConsole {
	private String llmCode;
	private Integer pricingConsoleCode;
	private String adminConsoleCode;
	private String managementConsole;
	private String consoleTools;
	private String cliTools;
	private boolean openSourceGatewayEnabled;
	private String totalLambdas;
	private String baseImage;
	private String memory;
	private String cpus;
	private String gpus;
	private String availabilityZones;
	private String multiRegionSupport;

	public LargeLangConsole() {

	}

	public LargeLangConsole(String llmCode, Integer pricingConsoleCode, String adminConsoleCode,
			String managementConsole, String consoleTools, String cliTools, boolean openSourceGatewayEnabled,
			String totalLambdas, String baseImage, String memory, String cpus, String gpus, String availabilityZones,
			String multiRegionSupport) {
		super();
		this.llmCode = llmCode;
		this.pricingConsoleCode = pricingConsoleCode;
		this.adminConsoleCode = adminConsoleCode;
		this.managementConsole = managementConsole;
		this.consoleTools = consoleTools;
		this.cliTools = cliTools;
		this.openSourceGatewayEnabled = openSourceGatewayEnabled;
		this.totalLambdas = totalLambdas;
		this.baseImage = baseImage;
		this.memory = memory;
		this.cpus = cpus;
		this.gpus = gpus;
		this.availabilityZones = availabilityZones;
		this.multiRegionSupport = multiRegionSupport;
	}

	public String getLlmCode() {
		return llmCode;
	}

	public void setLlmCode(String llmCode) {
		this.llmCode = llmCode;
	}

	public Integer getPricingConsoleCode() {
		return pricingConsoleCode;
	}

	public void setPricingConsoleCode(Integer pricingConsoleCode) {
		this.pricingConsoleCode = pricingConsoleCode;
	}

	public String getAdminConsoleCode() {
		return adminConsoleCode;
	}

	public void setAdminConsoleCode(String adminConsoleCode) {
		this.adminConsoleCode = adminConsoleCode;
	}

	public String getManagementConsole() {
		return managementConsole;
	}

	public void setManagementConsole(String managementConsole) {
		this.managementConsole = managementConsole;
	}

	public String getConsoleTools() {
		return consoleTools;
	}

	public void setConsoleTools(String consoleTools) {
		this.consoleTools = consoleTools;
	}

	public String getCliTools() {
		return cliTools;
	}

	public void setCliTools(String cliTools) {
		this.cliTools = cliTools;
	}

	public boolean isOpenSourceGatewayEnabled() {
		return openSourceGatewayEnabled;
	}

	public void setOpenSourceGatewayEnabled(boolean openSourceGatewayEnabled) {
		this.openSourceGatewayEnabled = openSourceGatewayEnabled;
	}

	public String getTotalLambdas() {
		return totalLambdas;
	}

	public void setTotalLambdas(String totalLambdas) {
		this.totalLambdas = totalLambdas;
	}

	public String getBaseImage() {
		return baseImage;
	}

	public void setBaseImage(String baseImage) {
		this.baseImage = baseImage;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getCpus() {
		return cpus;
	}

	public void setCpus(String cpus) {
		this.cpus = cpus;
	}

	public String getGpus() {
		return gpus;
	}

	public void setGpus(String gpus) {
		this.gpus = gpus;
	}

	public String getAvailabilityZones() {
		return availabilityZones;
	}

	public void setAvailabilityZones(String availabilityZones) {
		this.availabilityZones = availabilityZones;
	}

	public String getMultiRegionSupport() {
		return multiRegionSupport;
	}

	public void setMultiRegionSupport(String multiRegionSupport) {
		this.multiRegionSupport = multiRegionSupport;
	}

}