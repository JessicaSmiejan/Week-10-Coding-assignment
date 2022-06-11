package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.ZoneDao;
import entity.Zone;

public class Menu {
	private ZoneDao zoneDao = new ZoneDao();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display USDA Zone",
			"Update a USDA Zone",
			"Dispaly a Plant",
			"Add a plant",
			"Delete a Plant",
			"Update a Plant" 
			);
	
	
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection =scanner.nextLine();
			
			try {
				if (selection.equals("1")) {
					displayZones();
				}else if (selection.equals("2")) {
					//UpdateZone();
				}else if (selection.equals("3")) {
					//displayZone();
				}else if (selection.equals("4")) {
					//addPlant();
				}else if (selection.equals("5")) {
					//deletePlant();
				}else if (selection.equals("6")) {
					//UpdatePlant();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Press enter to  continue ... ");
			scanner.nextLine();
			
		}while (!selection.equals("-1"));
		
	}

		
	private void printMenu() {
		System.out.println("select an Option:\n ----------------------");
		for(int i = 0; i < options.size(); i++ ) {
			System.out.println(i +1 + ") " + options.get(i));
	}
		}
		private void displayZones() throws SQLException{
			List<Zone> zones = zoneDao.getZone();
			
			for (Zone zone : zones) {
			System.out.println(zone.getZoneID()+ ": " + zone.getUSDAZone());
		}
}
}