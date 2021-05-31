package Concretes;
import Entities.Player;

public interface Playerverification {
	
	boolean checkIfRealPerson(Player gamer);

	boolean update(Player player);

	boolean delete(Player player);

}
