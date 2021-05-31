package Entities;

public class Campaignn {
	
	private int kampanyaId;
	private String kampanyaName;
	
	public Campaignn ( ) {
		
	}

	public Campaignn(int kampanyaId, String kampanyaName) {
		super();
		this.kampanyaId = kampanyaId;
		this.kampanyaName = kampanyaName;
	}

	public int getKampanyaId() {
		return kampanyaId;
	}

	public void setKampanyaId(int kampanyaId) {
		this.kampanyaId = kampanyaId;
	}

	public String getKampanyaName() {
		return kampanyaName;
	}

	public void setKampanyaName(String kampanyaName) {
		this.kampanyaName = kampanyaName;
	}

	
	
	
	
	
	
}
