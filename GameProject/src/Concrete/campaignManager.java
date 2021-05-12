package Concrete;
import Abstract.*;
import Entities.*;
public class campaignManager implements campaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya başarıyla sisteme eklendi: " + campaign.getCampaignName());	
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri başarıyla güncellendi: " + campaign.getCampaignName());		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya başarıyla sistemden silindi: " + campaign.getCampaignName());		
	}	
	
}
