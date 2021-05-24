package Entities;

public class Product {
	
	
	//Satýþý yapýlan þeyler oyun da olsa sonuçta birer ürün. Ürün özellik sýnýfýmýz.
	
	//Attribute field..
		
	private int productId;					//Ürün id.
	private String productName;				//Ürün adý.
	private String productDescription;		//Ürün açýklamasý.
	private double productPrice;			//Ürün fiyatý.
	
	public Product(int productId, String productName, String productDescription, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}
	
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductDescription() {
		return this.productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public double getProductPrice() {
		return this.productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	

}
