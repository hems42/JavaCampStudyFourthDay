package Adapters;

import java.rmi.RemoteException;

import Abstracts.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
 
	@Override
    public boolean isRealPerson(Customer customer) {
    	
    	boolean result=false;
        
    	KPSPublicSoapProxy kps= new KPSPublicSoapProxy();
    	
    	
    	
    	try {
			if(kps.TCKimlikNoDogrula(Long.parseLong(customer.getNaitonalityId()), customer.getFirstName().toUpperCase(),customer.getLastname().toUpperCase(),customer.getDateOfBirth().getYear()))
			{
				result=true;
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("mernsten fýlatýlan hata  "+e.toString());
		}
       
        		
    	return result;
    }
    
   
}
