import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentJunitTestCases {

	@Test
	public void fillStudentNameJunitTest1() throws NameException{
		Student s=new Student("Siddharth",new DOB(11,9,1997),new Address("101","Hall 4","Madhya Pradesh",482005),"918009039189");
		assertEquals("Shyam",s.fillStudentName("Shyam"));
	}
	
	@Test
	void fillDOBJunitTest1() throws DOBException{
		DOB d=new DOB(15,11,1995);
		Student s=new Student("Siddharth",new DOB(11,9,1996),new Address("101","Hall 4","Madhya Pradesh",482005),"918009039189");
		assertEquals(d,s.fillDOB(d));
	}
	
	@Test
	void fillAddressJunitTest1() throws AddressException {
		Address a=new Address("108","Hall 3","Madhya Pradesh",482005);
		Student s=new Student("Siddharth",new DOB(11,9,1997),new Address("101","Hall 4","Madhya Pradesh",482005),"918009039189");
		assertEquals(a.toString(),s.fillAddress(a));
	}

	
	@Test
	void fillMobileNoJunitTest1() throws MobileNoException {
		String str=new String("918574858585");
		Student s=new Student("Siddharth",new DOB(11,9,1997),new Address("101","Hall 4","Madhya Pradesh",482005),"918009039189");
		assertEquals(str,s.fillMobileNo("918574858585"));
	}
	
	@Test()
	void fillStudentNameJunitTest2() {
		Student s=new Student("Siddharth",new DOB(11,9,1997),new Address("101","Hall 4","Madhya Pradesh",482005),"918009039189");
	    assertThrows(NameException.class, () -> {
	        s.fillStudentName("123Siddhart");
	    });
	}
	
	@Test
	void fillDOBJunitTest2() throws DOBException {
		DOB d=new DOB(15,11,2014);
		Student s=new Student("Siddharth",new DOB(11,9,1997),new Address("101","Hall 4","Madhya Pradesh",482005),"918009039189");
		assertThrows(DOBException.class, () -> {
	        s.fillDOB(new DOB(30,18,2010));
	    });
	}
	
	@Test
	void fillAddressJunitTest2() throws AddressException {
		Address a=new Address("108","Hall 3","Madhya Pradesh",482005);
		Student s=new Student("Siddharth",new DOB(11,9,1997),new Address("101","Hall 4","Madhya Pradesh",482005),"918009039189");
		assertThrows(AddressException.class, () -> {
	        s.fillAddress(new Address("101","","Madhya Pradesh",482005));
	    });
		assertEquals(a.toString(),s.fillAddress(a));
	}

	
	@Test
	void fillMobileNoJunitTest2() throws MobileNoException {
		Student s=new Student("Siddharth",new DOB(11,9,1997),new Address("101","Hall 4","Madhya Pradesh",482005),"918009039189");
		assertThrows(MobileNoException.class, () -> {
	        s.fillMobileNo("8574");
	    });
	}


}
