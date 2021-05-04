package Concrete;

import Abstracts.BaseCustumerManager;
import Abstracts.BaseLogger;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustumerManager {

    private CustomerCheckService customerCheckService;
    private BaseLogger [] loggers;

    public StarBucksCustomerManager(CustomerCheckService customerCheckService, BaseLogger [] loggers) {
        
    	this.loggers=loggers;
    	this.customerCheckService = customerCheckService;
        brandName="StarBucks Kahve Şirketi";
        
    }

    @Override
    public void save(Customer customer) {

        if(customerCheckService.isRealPerson(customer))
        {
            super.save(customer);
            
            for(BaseLogger logger:loggers)
            {
            	logger.log(customer.getFirstName()+" "+customer.getLastname() +" isimli müşteri eklendi");
            }
        }
       else {
            System.out.println("Düzgün veri gir lannn");
        }
    }
}
