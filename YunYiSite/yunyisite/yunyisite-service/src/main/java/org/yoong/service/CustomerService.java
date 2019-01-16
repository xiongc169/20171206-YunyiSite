package org.yoong.service;

import java.util.List;

public interface CustomerService {

	int addCustomer(Customer customer);

	List<Customer> getCustomers();

}
