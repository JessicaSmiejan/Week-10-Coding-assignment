package entity;

import java.util.List;

public class Zone {
	
	private int zoneID;
	private String USDAZone;
	private List<Zone> zones;
public Zone(int zoneID, String USDAZone, List<Zone> list ) {
	this.setZoneID(zoneID);
	this.setUSDAZone(USDAZone);
	this.setZones(list);
	
}
public int getZoneID() {
	return zoneID;
}
public void setZoneID(int zoneID) {
	this.zoneID = zoneID;
}
public String getUSDAZone() {
	return USDAZone;
}
public void setUSDAZone(String uSDAZone) {
	USDAZone = uSDAZone;
}
public List<Zone> getZones() {
	return zones;
}
public void setZones(List<Zone> list) {
	this.zones = list;
}
	
}
