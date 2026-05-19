package api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	
	private String accountNo;
    private String customerName;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String postalCode;
    private int pP_Recovery;
    private String meterNo;
    private int sgc;
    private int tariffIndex;
    private boolean blockPrepaid;
    private double currentBalance;
    private String currentBalanceSign;
    private double arrearsBalance;
    private String arrearsBalanceSign;
    private String lastPaymentMade;
    private String lastPaymentDate;
    private String meterType;
    private String code;
    private String description;
    private int indigent_Status;
    private double amount;
    private String tariff;
    private int krn;
    
    @JsonProperty("isValidationMode")
    private boolean validationMode;
    
	
    public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public int getpP_Recovery() {
		return pP_Recovery;
	}
	public void setpP_Recovery(int pP_Recovery) {
		this.pP_Recovery = pP_Recovery;
	}
	public String getMeterNo() {
		return meterNo;
	}
	public void setMeterNo(String meterNo) {
		this.meterNo = meterNo;
	}
	public int getSgc() {
		return sgc;
	}
	public void setSgc(int sgc) {
		this.sgc = sgc;
	}
	public int getTariffIndex() {
		return tariffIndex;
	}
	public void setTariffIndex(int tariffIndex) {
		this.tariffIndex = tariffIndex;
	}
	public boolean isBlockPrepaid() {
		return blockPrepaid;
	}
	public void setBlockPrepaid(boolean blockPrepaid) {
		this.blockPrepaid = blockPrepaid;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getCurrentBalanceSign() {
		return currentBalanceSign;
	}
	public void setCurrentBalanceSign(String currentBalanceSign) {
		this.currentBalanceSign = currentBalanceSign;
	}
	public double getArrearsBalance() {
		return arrearsBalance;
	}
	public void setArrearsBalance(double arrearsBalance) {
		this.arrearsBalance = arrearsBalance;
	}
	public String getArrearsBalanceSign() {
		return arrearsBalanceSign;
	}
	public void setArrearsBalanceSign(String arrearsBalanceSign) {
		this.arrearsBalanceSign = arrearsBalanceSign;
	}
	public String getLastPaymentMade() {
		return lastPaymentMade;
	}
	public void setLastPaymentMade(String lastPaymentMade) {
		this.lastPaymentMade = lastPaymentMade;
	}
	public String getLastPaymentDate() {
		return lastPaymentDate;
	}
	public void setLastPaymentDate(String lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}
	public String getMeterType() {
		return meterType;
	}
	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIndigent_Status() {
		return indigent_Status;
	}
	public void setIndigent_Status(int indigent_Status) {
		this.indigent_Status = indigent_Status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTariff() {
		return tariff;
	}
	public void setTariff(String tariff) {
		this.tariff = tariff;
	}
	public int getKrn() {
		return krn;
	}
	public void setKrn(int krn) {
		this.krn = krn;
	}
	public boolean isValidationMode() {
	    return validationMode;
	}

	public void setValidationMode(boolean validationMode) {
		
	    this.validationMode = validationMode;
	}


}
