package ie.ulster.exam.models;


public class Rooms {

    private String roomName, feature;
    private int roomId, capacity;
    private Boolean alcoholAllowed;

    public Rooms() {
    }

    public Rooms(int roomId, String room, String feature, int calacity, Boolean alcoholAllowed) {
        this.roomId = roomId;
        this.roomName = room;
        this.feature = feature;
        this.capacity = calacity;
        this.alcoholAllowed = alcoholAllowed;
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
