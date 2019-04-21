package ie.ulster.exam.dao.implementation;

import ie.ulster.exam.models.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ie.ulster.exam.dao.RoomDao;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class RoomsDaoImpl implements RoomDao {

    private final String SELECT_SQL = "SELECT * FROM dbo.PartyRooms";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Implement findAll() which retrieves all products from the DB
    // ProductMapper() converts rows from the result into Product objects
    public List<Rooms> findAll() {
        return jdbcTemplate.query(SELECT_SQL, new RoomMapper());
    }


}

class RoomMapper implements RowMapper<Rooms> {
    @Override
    public Rooms mapRow(ResultSet rs, int rowNum) throws SQLException {
        Rooms r = new Rooms();
        r.setRoomId(rs.getInt("RoomId"));
        r.setRoomName(rs.getString("Room"));
        r.setCapacity(rs.getInt("Capacity"));
        r.setFeature(rs.getString("Feature"));
        r.setAlcoholAllowed(rs.getBoolean("AlcoholAllowed"));
        return r;
    }
}
