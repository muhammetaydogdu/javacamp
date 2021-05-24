package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManagerMernis implements CustomerCheckService{

	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		//TC numarasýnýn kontrol edilip hatalý olduðunun tespit edildiði mernis simülasyonu.
		return false;
	}
	
}
