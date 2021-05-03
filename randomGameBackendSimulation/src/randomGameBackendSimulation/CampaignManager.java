package randomGameBackendSimulation;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() +  " kampanyası eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() +  " kampanyası silindi");
		
	}

	@Override
	public void uptade(Campaign campaign) {
		System.out.println(campaign.getName() +  " kampanyası güncellendi");
		
	}

	
		
}
