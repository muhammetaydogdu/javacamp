package Abstract;


import Entities.*;

public interface SaleService {
	
	public void sell(Product product, Customer customer); 				//Kampanyasýz Satýþ.
	
	public void addBalance(Customer customer, double amount);			//Bakiye ekleme de bir satýþtýr.

}
