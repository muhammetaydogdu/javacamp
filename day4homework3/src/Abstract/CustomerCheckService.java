package Abstract;

import Entities.Customer;

public interface CustomerCheckService {

	//Kullanýcý Doðrulama fonksiyonunun temelinin yazýldýðý yer.
	
	public boolean checkIfRealPerson(Customer customer);
	
}
