public class Address {
	private String houseNo;
	private String street;
	private String state;
	private Integer pinCode;
	
	
	public Address(String houseNo, String street, String state, Integer pinCode) {
		this.houseNo = houseNo;
		this.street = street;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	
	
	@Override
	public String toString() {
		return String.valueOf(houseNo)+" "+String.valueOf(street) + " " + String.valueOf(state) + " " + String.valueOf(pinCode) + " ";
	}



	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
