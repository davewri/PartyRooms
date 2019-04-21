package ie.ulster.exam.dao;

import ie.ulster.exam.models.Rooms;

import java.util.List;

public interface RoomDao {

    // Return a list containing all the room objects
    public List<Rooms> findAll();

}
