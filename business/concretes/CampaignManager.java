package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDiscount()+"% discount added ");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDiscount()+" discount updated ");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getDiscount()+" discount deleted");
		
	}
	

}



