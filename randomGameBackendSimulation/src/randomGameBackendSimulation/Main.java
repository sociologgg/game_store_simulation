package randomGameBackendSimulation;

public class Main {

	public static void main(String[] args) {
		Verification[] verifications = {new firstAndLastNameVerification(),new tcNoVerification()};
		
		UserManager userManager = new UserManager(verifications);
		User user1 = new User("12345678910","Alim","Örnek");
		Campaign campaign1 = new Campaign(1,"Black Friday",20);
		Campaign NoCampaign = new Campaign(2,"NO Campaign",0);
		Game game1 = new Game(1,"CSGO","Valve", 100,campaign1);
		Game game2 = new Game(2,"VALORANT", "Riot",20, NoCampaign);
		userManager.register(user1);
		System.out.println("-----------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(user1,game1,campaign1);
		saleManager.sell(user1, game2, NoCampaign);
		
		
	}

}
