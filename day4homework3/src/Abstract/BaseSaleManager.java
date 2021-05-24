package Abstract;

import Entities.*;


public class BaseSaleManager implements SaleService {

	@Override
	public void sell(Product product, Customer customer) {
		// TODO Auto-generated method stub
		//Kampanyasýz standart satýþ operasyonumuz.
		
		double customerBalance = customer.getBalance();
		double productPrice = product.getProductPrice();
		
		if(customerBalance >= productPrice)
		{
			//Müþterinin hesabýndaki bakiye, ürün fiyatýndan yüksekse.
			//Kýsaca parasý yetiyorsa.
			System.out.println("Sayýn "+customer.getFirstName()+","+product.getProductName()+" isimli ürünü"
					+ "baþarýyla satýn aldýnýz.");
			customerBalance= customerBalance-productPrice;
			System.out.println("Harcama tutarý :"+productPrice);
			System.out.println("Kalan bakiye :"+customerBalance);
			customer.setBalance(customerBalance);
			
			
		}
		else
		{
			System.out.println("Bu satýn alma için yeterli bakiyeye sahip deðilsiniz.");
			System.out.println("Mevcut bakiyeniz : "+customerBalance);
			System.out.println("Satýn alma için gerekli bakiye :"+(productPrice-customerBalance));
		}
		
	}
	
	@Override
	public void addBalance(Customer customer, double amount) {
		// TODO Auto-generated method stub
		customer.setBalance(customer.getBalance()+amount);
		System.out.println("Bakiye yükleme baþarýlý. Yükleme tutarý :"+amount+" Yeni bakiyeniz :"+customer.getBalance());
	}

	
	
	
}
