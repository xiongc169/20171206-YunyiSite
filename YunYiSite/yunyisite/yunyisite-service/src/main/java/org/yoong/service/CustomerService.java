package org.yoong.service;

import java.util.List;

import org.yoong.domain.Customer;

public interface CustomerService {

	int addCustomer(Customer customer);

	List<Customer> getCustomers();

}
