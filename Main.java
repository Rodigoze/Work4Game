import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.OrderManager;
import business.concretes.SaleManager;

import business.concretes.UserManager;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Order;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		UserManager userManager = new UserManager();
		OrderManager orderManager = new OrderManager();
		SaleManager saleManager = new SaleManager();
		User user = new User(1,"Rodi","Goze","rodi.goze8@outlook.com","gozerodi","24013299022",2000);
		
		Game gameRpg = new Game(1,"The Witcher 3  ",30," RPG ");
		Game gameFps = new Game(2,"CS  ",20," FPS");
		
		Game[] games = new Game[] {gameRpg,gameFps};		
		Order order = new Order(1,2,2);
		
		Campaign campaign = new Campaign(1,30);
		campaignManager.add(campaign);
		
		saleManager.buy(user, games, order, campaign);
		
		
		

	}

}
