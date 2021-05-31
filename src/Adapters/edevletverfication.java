package Adapters;
import Concretes.Playerverification;
import Entities.Player;


public class edevletverfication implements Playerverification {
	@Override
	public boolean checkIfRealPerson(Player player) {
		System.out.println("E-Devlet dogrulamasi yapýldý, hoþ geldin yakýþýklý :)");
		return true;
	}


	@Override
	public boolean update(Player player) {
		System.out.println("Bilgileriniz güncellenmiþtir, aksiyona devam :) ");
		return true;
	}


	@Override
	public boolean delete(Player player) {
		System.out.println("Her gidiþin bir dönüþü vardýr üzülme :)");
		return true;
	}

	
	

	
}
