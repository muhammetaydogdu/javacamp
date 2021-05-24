package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	
	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+", baþarýyla kaydoldunuz.");
		
	}
	
	@Override
	public void updateFirstName(Customer customer, String firstName) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+" ismi, "+firstName+" olarak güncellendi.");
		customer.setFirstName(firstName);
		
	}
	
	@Override
	public void deleteAccount(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+" hesabýnýz baþarýyla silindi.");
		
	}
	
	
}
