package Main;
import Concrete.*;
import Entities.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Dilara");
		gamer1.setLastName("Koca");
		gamer1.setNationalId("12345678910");
		gamer1.setYearOfBirth(1998);

		gamerManager _gamerManager = new gamerManager();
		_gamerManager.add(gamer1);
		_gamerManager.update(gamer1);

		System.out.println("--------------------------------------------------");

		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Knowledge is Power");
		game1.setPrice(120);

		Game game2 = new Game();
		game2.setId(2);
		game2.setName("Sims");
		game2.setPrice(280);

		gameManager gameManager = new gameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.update(game2);

		System.out.println("-------------------------------------------------");

		Campaign campaign1 = new Campaign(50, game1.getPrice());
		campaign1.setId(1);
		campaign1.setCampaignName("Yaz Kampanyasý");

		Campaign campaign2 = new Campaign(30, game2.getPrice());
		campaign2.setId(1);
		campaign2.setCampaignName("Yeni Sezon Kampanyasý");

		campaignManager _campaignManager = new campaignManager();
		_campaignManager.add(campaign1);
		_campaignManager.add(campaign2);
		_campaignManager.update(campaign2);

		System.out.println();

		saleManager _saleManager = new saleManager();
		System.out.println("------KAMPANYALI SATIÞLAR----");
		_saleManager.campaignSale(campaign2, game2, gamer1);
		_saleManager.campaignSale(campaign1, game1, gamer1);
		System.out.println();
		System.out.println("-----KAMPANYASIZ SATIÞLAR-----");
		_saleManager.sale(game2,gamer1);		
		
	}

}
