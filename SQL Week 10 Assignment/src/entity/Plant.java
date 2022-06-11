package entity;

public class Plant {

	private int plantId;
	private String botanicalName;
	private String commonName;
	private String plantFamily;
	
	
	public Plant( int id, String botanicalName, String commonName, int plantId, String plantFamily) {
		this.plantId = plantId;
		this.setBotanicalName(botanicalName);
		this.setCommonName(commonName);
		this.setPlantFamily(plantFamily);
		
				
		}


	public String getBotanicalName() {
		return botanicalName;
	}


	public void setBotanicalName(String botanicalName) {
		this.botanicalName = botanicalName;
	}


	public String getCommonName() {
		return commonName;
	}


	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public int  plantId() {
		return plantId;
}


	public void setplantId(int plantId) {
		this.plantId = plantId;
	}


	public String getPlantFamily() {
		return plantFamily;
	}


	public void setPlantFamily(String plantFamily) {
		this.plantFamily = plantFamily;
	}
}	