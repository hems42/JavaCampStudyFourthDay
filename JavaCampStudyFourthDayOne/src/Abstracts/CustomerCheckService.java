package Abstracts;

import Entities.Customer;

import java.util.Calendar;

public interface CustomerCheckService {

    boolean isRealPerson(Customer customer);
}
