package Abstract;

import Entities.*;

public interface saleService {
	void sale(Game game,Gamer gamer);
	void campaignSale(Campaign campaign,Game game,Gamer gamer);
}
