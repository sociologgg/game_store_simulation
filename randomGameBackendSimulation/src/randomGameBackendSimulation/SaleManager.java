package randomGameBackendSimulation;

public class SaleManager implements SaleService {

	@Override
	public void sell(User user, Game game,Campaign campaign) {
		
		if( campaign.getDiscountRate() == 0) {
			System.out.println(game.getName() + " oyunu " + user.getFirstName() + " " + user.getLastName() + " kullanıcısına " + game.getPrice() + " TL fiyatına satıldı." );
		} else {
			System.out.println(game.getName() + " oyunu " + user.getFirstName() + " " + user.getLastName() + " kullanıcısına " + campaign.getName() + " kampanyası ile " + game.getPriceAfterDiscount() + " TL fiyatına satıldı." );
		
			
		}
		

	
	}
}
