
public class RailwayStation {
	private String railwaystationName;
	private String stationcode;
	Platform[] platforms;
	TicketCounter[] TicketCounters;
	WaitingRoom [] waitingrooms;
	public RailwayStation(String railwaystationName, String stationcode, Platform[] platforms,
			TicketCounter[] ticketCounters) {
		super();
		this.railwaystationName = railwaystationName;
		this.stationcode = stationcode;
		this.platforms = platforms;
		TicketCounters = ticketCounters;
	}
	public RailwayStation() {
		super();
	}
	public String getRailwaystationName() {
		return railwaystationName;
	}
	public void setRailwaystationName(String railwaystationName) {
		this.railwaystationName = railwaystationName;
	}
	public String getStationcode() {
		return stationcode;
	}
	public void setStationcode(String stationcode) {
		this.stationcode = stationcode;
	}
	public Platform[] getPlatforms() {
		return platforms;
	}
	public void setPlatforms(Platform[] platforms) {
		this.platforms = platforms;
	}
	public TicketCounter[] getTicketCounters() {
		return TicketCounters;
	}
	public void setTicketCounters(TicketCounter[] ticketCounters) {
		TicketCounters = ticketCounters;
	}
	public WaitingRoom[] getWaitingrooms() {
		return waitingrooms;
	}
	public void setWaitingrooms(WaitingRoom[] waitingrooms) {
		this.waitingrooms = waitingrooms;
	}
	
}
