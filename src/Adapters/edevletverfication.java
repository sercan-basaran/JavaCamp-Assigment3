package Adapters;
import Concretes.Playerverification;
import Entities.Player;


public class edevletverfication implements Playerverification {
	@Override
	public boolean checkIfRealPerson(Player player) {
		System.out.println("E-Devlet dogrulamasi yap�ld�, ho� geldin yak���kl� :)");
		return true;
	}


	@Override
	public boolean update(Player player) {
		System.out.println("Bilgileriniz g�ncellenmi�tir, aksiyona devam :) ");
		return true;
	}


	@Override
	public boolean delete(Player player) {
		System.out.println("Her gidi�in bir d�n��� vard�r �z�lme :)");
		return true;
	}

	
	

	
}
