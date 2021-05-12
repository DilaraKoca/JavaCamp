package Concrete;

import Abstract.saleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class saleManager implements saleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("Merhaba " + gamer.getFirstName() + ". " + game.getName() + " adl� oyunu " 
				+ game.getPrice() + " Tl'ye sat�n aldn�z.");		
	}

	@Override
	public void campaignSale(Campaign campaign, Game game, Gamer gamer) {
		System.out.println("Merhaba " +gamer.getFirstName()+" "+campaign.getCampaignName()+" kapsam�nda "+game.getName()
		+ " adl� oyunu" +" %" +campaign.getDiscountRate()+" indirimle " 
		+campaign.newPrice()+" Tl'ye sat�n ald�n�z."
		);
	}

}
