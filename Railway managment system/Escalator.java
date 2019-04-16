
public class Escalator {
	private String escalatorid;
	private Integer powerRequirement;
	Platform platform;
	public Escalator() {
		
	}
	public Escalator(String escalatorid,Integer powerRequirement) {
		super();
		this.escalatorid = escalatorid;
		this.setPowerRequirement(powerRequirement);
	}
	public String getEscalatorid() {
		return escalatorid;
	}
	public void setEscalatorid(String escalatorid) {
		this.escalatorid = escalatorid;
	}
	public Platform getPlatform() {
		return platform;
	}
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	public Integer getPowerRequirement() {
		return powerRequirement;
	}
	public void setPowerRequirement(Integer powerRequirement) {
		this.powerRequirement = powerRequirement;
	}
	@Override
	public String toString() {
		String s=new String("");
		s=" "+this.escalatorid;
		s=s+"\t Power Requirement : "+this.powerRequirement;
		return s;
	}
	
	
}
