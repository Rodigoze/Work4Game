package business.concretes;

import business.abstracts.OrderService;
import business.abstracts.SaleService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Order;
import entities.concretes.User;

public class SaleManager implements SaleService {
	private OrderService orderService;
	
	
	public void SaleManager(OrderService orderService) {
		this.orderService =orderService;
	}

	@Override
	public void buy(User user, Game[] games, Order order, Campaign campaign) {
		double total=0.0;
		System.out.println(user.getFirstName()+" "+ user.getLastName());
		for (Game game:games) {
			System.out.println(game.getName()+game.getUnitPrice());
			total+=game.getUnitPrice();
		}
		System.out.println("Total price: " +total);
		if (campaign !=null) {
			calculate(campaign,total);
		}
		orderService.add(order);
		
	}

	private void calculate(Campaign campaign, double total) {
		System.out.println("Campaign discount : "+ "-"+total*campaign.getDiscount()/100);
		


		
	}
	
	
	

}



