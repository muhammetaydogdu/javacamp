package Entities;

public class Campaing {
	
	//Kampanyalarýn özellik sýnýfý.

	//Attribute field...
		
	private int campaingId;						//Kampanya id.
	private String campaingName;				//Kampanya adý.
	private String campaingDescription;			//Kampanya açýklamasý.
	private double campaingRatio;			//Kampanya indirim yüzdesi
	
	
	public Campaing(int campaingId, String campaingName, String campaingDescription,
			double campaingRatio) {
		
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.campaingDescription = campaingDescription;
		this.campaingRatio = campaingRatio;
		
	}
	
	
	public int getCampaingId() {
		return this.campaingId;
	}
	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}
	
	
	public String getCampaingName() {
		return this.campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	
	public String getCampaingDescription() {
		return this.campaingDescription;
	}
	public void setCampaingDescription(String campaingDescription) {
		this.campaingDescription = campaingDescription;
	}
	
	
	public double getCampaingRatio() {
		return this.campaingRatio;
	}
	public void setCampaingRatio(double campaingRatio) {
		this.campaingRatio = campaingRatio;
	}
	
	
	
	
	
}
