package Concrete;
import Abstract.*;
import Entities.*;
public class campaignManager implements campaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya baþarýyla sisteme eklendi: " + campaign.getCampaignName());	
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri baþarýyla güncellendi: " + campaign.getCampaignName());		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya baþarýyla sistemden silindi: " + campaign.getCampaignName());		
	}	
	
}
