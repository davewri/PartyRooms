package ie.ulster.exam.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookingDto implements Serializable {

    private Integer roomId;

    private String roomName;

    private String childrenAttending;

    private List<String> error = new ArrayList();

    public String getChildrenAttending() {
        return childrenAttending;
    }

    public void setChildrenAttending(String childrenAttending) {
        this.childrenAttending = childrenAttending;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<String> getErrors() {
        return error;
    }

    public boolean validate() {
        if(childrenAttending != "Yes" || childrenAttending != "No") {
            error.add("Must have children");
        }

        if(!roomName.equals("")) {
            error.add("Must have a room name");
        }
        return error.size()==0;
    }

    @Override
    public String toString() {
        return "BookingDto{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}
