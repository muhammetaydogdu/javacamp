package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService  {

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" isimli ürün baþarýyla veritabanýna kaydedilmiþtir.");
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" isimli ürün baþarýyla güncellenmiþtir.");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" isimli ürün baþarýyla veritabanýndan silinmiþtir.");
	}

	
}
