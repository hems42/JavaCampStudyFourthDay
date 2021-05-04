package Adapters;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public class MyTestServiceAdapter implements CustomerCheckService {
    @Override
    public boolean isRealPerson(Customer customer) {
        return true;
    }
}
