
public class Lift{
	private String liftid;
	Platform platform;
	public Lift(){
		
	}
	public Lift(String liftid) {
		this.liftid=liftid;
	}
	public String getLiftid() {
		return liftid;
	}
	public void setLiftid(String liftid) {
		this.liftid = liftid;
	}
	public Platform getPlatform() {
		return platform;
	}
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	@Override
	public String toString() {
		return "\n Lift ID : "+this.liftid;
	}
	
	
	
}
