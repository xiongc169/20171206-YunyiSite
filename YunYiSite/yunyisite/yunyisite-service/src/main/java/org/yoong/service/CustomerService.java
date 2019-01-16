package org.yoong.service;

import org.yoong.wong_user.domain.Customer;

import java.util.List;

public interface CustomerService {

    int addCustomer(Customer customer);

    List<Customer> getCustomers();

}
