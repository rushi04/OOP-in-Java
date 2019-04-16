import java.util.Arrays;

public abstract class Train {
	private String train_name;
	private String train_number;
	Engine[] engines;
	Coach[] coaches;
	Platform platform;
	String type;
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getTrain_number() {
		return train_number;
	}
	public void setTrain_number(String train_number) {
		this.train_number = train_number;
	}
	public Train() {
		
	}
	public Train(String train_name, String train_number) {
		super();
		this.train_name = train_name;
		this.train_number = train_number;
	}
	public void setTrain(Coach[] coaches,Engine[] engines,Platform platform) {
		this.coaches=coaches;
		this.engines=engines;
		this.platform=platform;
	}
	@Override
	public String toString() {
		String s=new String("");
		s="\n Train Name : "+this.train_name;
		s=s+"\n  Train Number : "+this.train_number;
		s=s+"\n  Train type : "+this.type+"\n";
		s=s+ Arrays.toString(engines) + "\ncoaches: " + Arrays.toString(coaches);
		return s;
	}
	
	
}
