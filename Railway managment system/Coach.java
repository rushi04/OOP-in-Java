
public abstract class Coach {
	private String coach_id;
	String type;
	public String getCoach() {
		return coach_id;
	}
	public void setCoach(String coach_id) {
		this.coach_id = coach_id;
	}
	public Coach() {
		
	}
	public Coach(String coach_id) {
		super();
		this.coach_id = coach_id;
	}
	@Override
	public String toString() {
		String s=new String("");
		s=s+"\n   "+this.coach_id;
		s=s+"\t"+this.type;
		return s;
	}
	
}
