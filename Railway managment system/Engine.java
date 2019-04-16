
public abstract class Engine {
	private String engineName;
	private Integer capacity;
	String type;
	Train train;
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Engine(String engineName, Integer capacity) {
		super();
		this.engineName = engineName;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		String s=new String("");
		s="\n* Engine ID : "+this.engineName;
		s=s+"\n  Engine Capacity "+this.capacity;
		s=s+"\n  Engine Type  "+this.type;
		return s;
	}
	
	
	
}
