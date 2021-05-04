package Abstracts;

import Entities.Customer;

public abstract class BaseCustumerManager implements CustomerServices {

   protected String brandName;

    @Override
    public void save(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastname()+ "  isimli kullanıcı "+brandName+" isimli markaya kaydedildi.");
    }
}
