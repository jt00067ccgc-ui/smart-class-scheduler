package backend.java.scheduler;

public class Room {
    private String roomId;
    private String roomName;
    private int capacity;
    private String building;

    public Room(String roomId, String roomName, int capacity, String building) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.capacity = capacity;
        this.building = building;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}