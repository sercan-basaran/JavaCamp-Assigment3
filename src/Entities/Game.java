package Entities;

public class Game {


	private int gameId;
	private String gameName;
	private int price;
	private String gameDetails;
	private int stock;
	
	public Game () {
		
	}
	public Game(int gameId, String gameName, int price, String gameDetails, int stock) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.price = price;
		this.gameDetails = gameDetails;
		this.stock = stock;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGameDetails() {
		return gameDetails;
	}
	public void setGameDetails(String gameDetails) {
		this.gameDetails = gameDetails;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	
}
