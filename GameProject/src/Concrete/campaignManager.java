package Concrete;
import Abstract.*;
import Entities.*;
public class campaignManager implements campaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya ba�ar�yla sisteme eklendi: " + campaign.getCampaignName());	
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri ba�ar�yla g�ncellendi: " + campaign.getCampaignName());		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya ba�ar�yla sistemden silindi: " + campaign.getCampaignName());		
	}	
	
}
