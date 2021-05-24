package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService  {

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" isimli ürün başarıyla veritabanına kaydedilmiştir.");
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" isimli ürün başarıyla güncellenmiştir.");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" isimli ürün başarıyla veritabanından silinmiştir.");
	}

	
}
