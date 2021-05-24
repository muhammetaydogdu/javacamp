package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService{

	@Override
	public void save(Campaing campaing) {
		// TODO Auto-generated method stub
		System.out.println(campaing.getCampaingName()+" isimli kampanya veritabanýna eklendi.");
	}

	@Override
	public void update(Campaing campaing) {
		// TODO Auto-generated method stub
		System.out.println(campaing.getCampaingName()+" isimli kampanya güncellendi.");
	}

	@Override
	public void delete(Campaing campaing) {
		// TODO Auto-generated method stub
		System.out.println(campaing.getCampaingName()+" isimli kampanya veritabanýndan silindi.");
	}

	
	
	
	
}
