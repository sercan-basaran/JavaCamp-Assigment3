package Concretes;
import Entities.Campaignn;
import abstracts.CampaignnService;

public class CampaignnManager implements CampaignnService{


	@Override
	public void add(Campaignn kampanya) {
		
		System.out.println("beklenen kampanya iþte geldi");
	}

	@Override
	public void update(Campaignn kampanya) {
		System.out.println("beklenen kampanya yenilendi geldi");
		
	}

	@Override
	public void delete(Campaignn kampanya) {
		System.out.println("beklenen kampanya bitmiþtir");
			
	}
}
