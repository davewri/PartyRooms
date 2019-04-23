package ie.ulster.exam.models;


public class Rooms {

    private String roomName, feature;
    private int roomId, capacity;
    private Boolean alcoholAllowed;
    private String childrenAttending = "";

    public Rooms() {
    }

    public Rooms(int roomId, String room, String feature, int capacity, Boolean alcoholAllowed) {
        this.roomId = roomId;
        this.roomName = room;
        this.feature = feature;
        this.capacity = capacity;
        this.alcoholAllowed = alcoholAllowed;
    }

    public String getChildrenAttending() {
        return childrenAttending;
    }

    public void setChildrenAttending(String childrenAttending) {
        this.childrenAttending = childrenAttending;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String room) {
        this.roomName = room;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boolean getAlcoholAllowed() {
        return alcoholAllowed;
    }

    public void setAlcoholAllowed(Boolean alcoholAllowed) {
        this.alcoholAllowed = alcoholAllowed;
    }
}
