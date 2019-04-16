
public class Platform {
	private String platformNo;
	Escalator[] escalators;
	Lift []lift;
	Train[] trains;
	public Platform(String platformNo) {
		super();
		this.platformNo = platformNo;
		this.lift=null;
		this.escalators=null;
		this.trains=null;
	}
	public Platform() {
		
	}
	public String getPlatformNo() {
		return platformNo;
	}
	public void setPlatformNo(String platformNo) {
		this.platformNo = platformNo;
	}
	
	public String printPlatform() {
		String s=new String("");
		s="Platform is "+this.platformNo+"\n ";
		s=s+"No. of trains are "+this.trains.length+"\n";
		if(trains.length>0) {
			for(int i=0;i<trains.length;i++) {
				s=s+" *"+trains[i];
			}
		}
		if(lift.length>0) {
			for(int i=0;i<lift.length;i++) {
				s=s+"  *"+lift[i];
			}
		}
		if(escalators.length>0) {
			for(int i=0;i<escalators.length;i++) {
				s=s+"\n *"+escalators[i];
			}
		}
		return s;
	}
	
}
