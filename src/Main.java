import Adapters.edevletverfication;
import Concretes.CampaignnManager;
import Concretes.PlayerManager;
import Concretes.SalesManager;
import Entities.Game;
import Entities.Player;
import abstracts.PLayerService;
import abstracts.SalesService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		player.setId(1);
		player.setFirstName("Serkan");
		player.setLastName("Yıldırım");
		player.setNationalityNumber("656456126516");
		
		Game game = new Game();
		game.setGameId(6);
		game.setGameName("WarCraft");
		game.setPrice(150);
		game.setStock(45);
		

	    CampaignnManager kampanyayöneticisi = new CampaignnManager();
	    kampanyayöneticisi.add(null);
	    
		

		SalesService salesservice = new SalesManager();
		salesservice.buy(game, player);
		
		PLayerService playerService = new PlayerManager(new edevletverfication());
		playerService.add(player);
			
	
		

	}

}
