
public abstract class WaitingRoom extends RailwayStation{
	private String waitingRoom;
	private Integer capacity;
	RailwayStation station;
	String type;
	public String getWaitingRoom() {
		return waitingRoom;
	}
	public void setWaitingRoom(String waitingRoom) {
		this.waitingRoom = waitingRoom;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public WaitingRoom(String waitingRoom, Integer capacity) {
		super();
		this.waitingRoom = waitingRoom;
		this.capacity = capacity;
	}
	public WaitingRoom() {
		
	}
	@Override
	public String toString() {
		return "\nWaitingRoom: " + waitingRoom + "\n Capacity: " + capacity + "\n}";
	}
	
}
