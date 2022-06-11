package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Plant;
import entity.Zone;

public class PlantDao {
	
	private static Connection connection;
	private final static String GET_PLANT_BY_ZONE_ID_QUERY = "SELECT * FROM plant WHERE zone_id = ?";
	
	public static List<Plant> getPlantsByZoneId(int zoneId) throws SQLException {
		connection = DBConnection.getConnection();
		PreparedStatement ps= connection.prepareStatement(GET_PLANT_BY_ZONE_ID_QUERY);
		ps.setInt(1, zoneId);
		ResultSet rs =ps.executeQuery();
		List<Plant> plants = new ArrayList<Plant>();
		
		while (rs.next()) {
			plants.add(new Plant(rs.getInt(1), rs.getString(2),rs.getString(3), zoneId, rs.getString(4)));
		}
		return plants;
	}

}
