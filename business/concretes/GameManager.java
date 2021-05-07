package business.concretes;

import business.abstracts.GameService;
import entities.concretes.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
	 System.out.println(game.getName()+" added");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" updated");
		
	}

	@Override
	public void deleted(Game game) {
		System.out.println(game.getName()+" deleted");
		
	}

}



