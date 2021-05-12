package Concrete;

import Abstract.saleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class saleManager implements saleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("Merhaba " + gamer.getFirstName() + ". " + game.getName() + " adlý oyunu " 
				+ game.getPrice() + " Tl'ye satýn aldnýz.");		
	}

	@Override
	public void campaignSale(Campaign campaign, Game game, Gamer gamer) {
		System.out.println("Merhaba " +gamer.getFirstName()+" "+campaign.getCampaignName()+" kapsamýnda "+game.getName()
		+ " adlý oyunu" +" %" +campaign.getDiscountRate()+" indirimle " 
		+campaign.newPrice()+" Tl'ye satýn aldýnýz."
		);
	}

}
