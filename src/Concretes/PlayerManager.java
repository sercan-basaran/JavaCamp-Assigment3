package Concretes;
import Entities.Player;
import abstracts.PLayerService;

public class PlayerManager  implements PLayerService{

	Playerverification service;

	public PlayerManager(Playerverification service) {
		this.service = service;
	}

	@Override
	public void add(Player player) {
		if (service.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() +" "+ player.getLastName()+ " eklendi.");
		}

	}

	@Override
	public void update(Player player) {
		if (service.update(player)) {
			System.out.println(player.getFirstName() + player.getLastName()+ " bilgileriniz güncellenmitir.");
		}
	}

	@Override
	public void delete(Player player) {
		if (service.delete(player)) {
			System.out.println(player.getFirstName() + player.getLastName()+ " oyuncusu sistemden silinmiþtir");
		}
	}
}
