package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Zone;

public class ZoneDao {
	private Connection connection;
	private PlantDao plantDao;
	private final String Get_Zone_Query = "Select * From zone";
	
	public ZoneDao() {
	connection = DBConnection.getConnection();
	}
	public List<Zone> getZone() throws SQLException{
		ResultSet rs = connection.prepareStatement(Get_Zone_Query).executeQuery();
		List<Zone> zone =  new ArrayList<Zone>();
		
		while (rs.next()){
			zone.add(populateZone(rs.getInt(1), rs.getString(2)));
		}
		return zone;
	}
	private Zone populateZone(int id, String USDAZone) throws SQLException {
		return new Zone(id,USDAZone,PlantDao.getPlantsByZoneId(id));
		
	}
}
