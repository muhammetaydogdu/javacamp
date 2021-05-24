package Abstract;
import Entities.Customer;

public interface CustomerService {
	
	//Müþterilerin interface'i.
	
	public void save(Customer customer);		//Kayýt olma operasyonu.
	
	public void updateFirstName(Customer customer, String firstName);		//Kullanýcý Adý Güncelleme.
	
	public void deleteAccount(Customer customer);	//Kullanýcýyý silme operasyonu.
	
	
	
}
