import java.util.Date;

public class DOB {
	private Integer day;
	private Integer month;
	private Integer year;
	
	
	public DOB(Integer day, Integer month, Integer year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	@Override
	public String toString() {
		String str=String.valueOf(day)+String.valueOf(month)+String.valueOf(year);
		return str;
	}



	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public int compare(DOB dob){
		if(dob.toString().compareTo(this.toString())==-1){
			return -1;
		}else if(dob.toString().compareTo(this.toString())==1){
				return 1;
		}else if(dob.toString().compareTo(this.toString())==0){
			return 0;
		}
		return 1;
	}
}
