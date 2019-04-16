public class Student {
	private String studentName;
	private DOB dob;
	private Address address;
	private String mobileNo;
	
	
	
	public Student(String studentName, DOB dob, Address address, String mobileNo) {
		super();
		this.studentName = studentName;
		this.dob = dob;
		this.address = address;
		this.mobileNo = mobileNo;
	}

	private boolean validateName(String name){
		for(int i=0;i<name.length();i++){
			if(!Character.isLetter(name.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	private boolean validateDOB(DOB dob){
		DOB n=new DOB(01,01,1993);
		DOB m=new DOB(31,12,1997);
		if(dob.toString().compareTo(n.toString())==-1||dob.toString().compareTo(m.toString())==1) {
			return false;
		}
		if(dob.getMonth()>12){
			return false;
		}
		if(dob.getMonth()==2&&dob.getDay()>28){
			return false;
		}
		if((dob.getMonth()==4||dob.getMonth()==6||dob.getMonth()==9||dob.getMonth()==11)&&dob.getDay()>30){
			return false;
		}
		if((dob.getMonth()==1||dob.getMonth()==3||dob.getMonth()==5||dob.getMonth()==7||dob.getMonth()==8||dob.getMonth()==10||dob.getMonth()==12)&&dob.getDay()>31){
			return false;
		}
		return true;
	}
	
	private boolean validateAddress(Address address){
		if(address.getHouseNo().isEmpty()||address.getState().isEmpty()||address.getStreet().isEmpty()||address.getPinCode().toString().isEmpty()){
			return false;
		}
		if((int)address.getPinCode()!=address.getPinCode()){
			return false;
		}
		return true;
		
	}

	private boolean validateMobileNo(String mobileno) {
		if(mobileno.length()!=12){
			return false;
		}
		if(mobileno.compareTo("91000000000000")<0) {
			return false;
		}
		int i=0;
		while(i<12) {
			if(!Character.isDigit(mobileno.charAt(i))) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public String fillStudentName(String name) throws NameException{
			if(this.validateName(name)){
				this.studentName=name;
			}else{
				throw new NameException("Name Contains Numbers");
			}
		return name;
	}
	
	public DOB fillDOB(DOB dob) throws DOBException{
			if(this.validateDOB(dob)){
				this.dob=new DOB(dob.getDay(),dob.getMonth(),dob.getYear());
			}else{
				throw new DOBException("Invalid Date");
			}
		return dob;
	}
	
	public String  fillAddress(Address address)throws AddressException{
			if(this.validateAddress(address)){
				this.address=new Address(address.getHouseNo(),address.getState(),address.getStreet(),address.getPinCode());
			}else{
				throw new AddressException("Invalid Address");
			}
		return address.toString();
	}
	
	public String  fillMobileNo(String mobileno)throws MobileNoException{
			if(this.validateMobileNo(mobileno)){
				this.mobileNo=mobileno;
			}else{
				throw new MobileNoException("Invalid MobileNo");
			}
		return mobileno;
	}
}
