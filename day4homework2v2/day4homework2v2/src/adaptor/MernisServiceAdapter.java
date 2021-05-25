package adaptor;
import org.apache.axis.utils.tcpmon;

import Abstract.*;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;


public class MernisServiceAdapter implements CustomerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		
		// TODO Auto-generated method stub
		  KPSPublicSoap tc = new KPSPublicSoapProxy();
		  boolean deneme = false;
		  try {
		   deneme = tc.TCKimlikNoDogrula(Long.parseLong("***TC***"), 
		     "***AD***", "***SOYAD***", ***DOGUM***);
		  } catch (NumberFormatException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  } catch (RemoteException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  if (deneme == true) {
		   System.out.println(String.valueOf("Tc doðrudur"));
		  } else {
		   System.out.println("Tc yanlýþ");
		  }
		  
		  
		  return deneme;

	}
	
	

}
