package Concrete;

import Abstract.BaseSaleManager;
import Entities.*;

public class SaleManager extends BaseSaleManager{
	

	public void sell(Product product, Customer customer, Campaing campaing) {
		// TODO Auto-generated method stub
		//Burasý override deðil, overload metodu. Ya hak diyor devam ediyoruz.
		
		double productFirstPrice = product.getProductPrice();
		double campaingRatio = campaing.getCampaingRatio();
		double productPriceAfterDiscount = productFirstPrice-(productFirstPrice*(campaingRatio/100));
		product.setProductPrice(productPriceAfterDiscount);
		super.sell(product, customer);
		product.setProductPrice(productFirstPrice);
	}
	
	
}
