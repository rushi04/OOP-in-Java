
public abstract class TicketCounter {
	private String counterNumber;
	String type;
	RailwayStation station;
	public TicketCounter(String counterNumber) {
		super();
		this.counterNumber = counterNumber;
	}
	public TicketCounter() {
		super();
	}
	public String getCounterNumber() {
		return counterNumber;
	}
	public void setCounterNumber(String counterNumber) {
		this.counterNumber = counterNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public RailwayStation getStation() {
		return station;
	}
	public void setStation(RailwayStation station) {
		this.station = station;
	}
	
	
}
