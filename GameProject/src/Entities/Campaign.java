package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private int discountRate;
	private double unitPrice;
	public Campaign() {
		
	}
	public Campaign( int discountRate, double unitPrice) {
		super();
		this.discountRate = discountRate;
		this.unitPrice = unitPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double newPrice() {
		return this.unitPrice-(this.unitPrice*this.discountRate/100);
	}
	
}
