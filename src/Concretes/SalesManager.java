package Concretes;
import Entities.Game;
import Entities.Player;
import abstracts.SalesService;

public class SalesManager implements SalesService {

	
	
	
	@Override
	public void buy(Game game, Player player) {
		
		System.out.println(player.getFirstName() +" "+"bey" +" "+ game.getGameName()+" oyunu satýn aldý ") ;
		
	}

}
