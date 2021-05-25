package Concrete;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService  {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// Fake Check Sýnýfýmýz. Test amaçlý kullanacaðýz.
		return true;
	}
	
}
