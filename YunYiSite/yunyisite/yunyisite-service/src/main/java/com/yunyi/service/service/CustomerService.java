package com.yunyi.service.service;

import com.yunyi.domain.wong_user.Customer;

import java.util.List;

public interface CustomerService {

    int addCustomer(Customer customer);

    List<Customer> getCustomers();

}
