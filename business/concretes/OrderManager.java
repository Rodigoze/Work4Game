package business.concretes;

import business.abstracts.OrderService;
import entities.concretes.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(order.getGameId()+" added");
		
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getGameId()+" updated");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getGameId()+" deleted");
		
	}

	
}



