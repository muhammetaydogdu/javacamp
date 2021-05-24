package DefaultPackage;

import Entities.*;
import Concrete.*;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer muhammet = new Customer(1,"Muhammet Oðuzhan","AYDOÐDU","31487414158",LocalDate.of(1997, 8, 28));
		
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManagerMernis());
		
		customerManager.save(muhammet);
		customerManager.updateFirstName(muhammet, "Nurettin");
		customerManager.deleteAccount(muhammet);
		
		
		
		Product product1 = new Product(1, "Call Of Duty Warzone", "Call of duty online aksiyon oyunu", 20);
		
		ProductManager productManager = new ProductManager();
		
		productManager.save(product1);
		productManager.update(product1);
		productManager.delete(product1);
		
		
		Campaing campaing1 = new Campaing(1,"Hafta Sonu Ýndirimleri","Hafta sonuna özel indirimler.",10.0);
		
		CampaingManager campaingManager = new CampaingManager();
		
		campaingManager.save(campaing1);
		campaingManager.update(campaing1);
		campaingManager.delete(campaing1);
		
		
		SaleManager saleManager = new SaleManager();
		
		saleManager.sell(product1, muhammet);
		
		saleManager.addBalance(muhammet, 10);
		
		saleManager.sell(product1, muhammet);
		
		saleManager.addBalance(muhammet, 10);
		
		saleManager.sell(product1, muhammet);
		
		
		System.out.println(muhammet.getBalance());
		
		
		//Kampanyalý satýþ örneði geliyorrr.
		
		saleManager.addBalance(muhammet, 20);
		saleManager.sell(product1, muhammet, campaing1);
		System.out.println(product1.getProductPrice());
		
	
		

	}

}
