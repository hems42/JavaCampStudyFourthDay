package Concrete;

import Abstracts.BaseCustumerManager;
import Abstracts.CustomerCheckService;


public class NeroCustomerManager extends BaseCustumerManager {

    private CustomerCheckService customerCheckService;

    public NeroCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
        brandName="Nero Kahve Şirketi";

    }


}
