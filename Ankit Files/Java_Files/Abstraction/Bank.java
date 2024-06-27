public class Bank { 
	public String bankName = "SBI";
	public String branchName = "Gurgaon";
	private float bankValue = 1235.43f;
	protected String wifiPassword = "SBI_123";
	
	public Bank() {
		bankName = null;
		branchName = null;
		bankValue = 0.0f;
		wifiPassword = null;
	}
	
	public void printDetails() {
		System.out.println("Bank Name: "+bankName);
		System.out.println("Branch Name: "+branchName);
		System.out.println("Bank Value: "+bankValue);
		System.out.println("Wifi Password: "+wifiPassword);
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBranchName() {
		return bankName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public float getBankValue() {
		return bankValue;
	}
	public void setBankValue(float bankValue) {
		this.bankValue = bankValue;
	}
	
	public String getWifiPassword() {
		return wifiPassword;
	}
	public void setWifiPassword(String wifiPassword) {
		this.wifiPassword = wifiPassword;
	}
	
}