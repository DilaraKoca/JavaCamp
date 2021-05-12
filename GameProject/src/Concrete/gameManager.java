package Concrete;
import Abstract.*;
import Entities.*;
public class gameManager implements gameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " adlý oyun eklendi.");		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " adlý oyun silindi.");			
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ " adlý oyun güncellendi.");			
	}

}
