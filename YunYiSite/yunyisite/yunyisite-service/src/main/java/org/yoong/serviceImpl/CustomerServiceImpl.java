package org.yoong.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yoong.dao.CustomerMapper;
import org.yoong.domain.Customer;
import org.yoong.domain.CustomerExample;
import org.yoong.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerDao;

	@Override
	public int addCustomer(Customer customer) {
		int effectRows = customerDao.insertSelective(customer);
		return effectRows;
	}

	@Override
	public List<Customer> getCustomers() {
		CustomerExample example = new CustomerExample();
		List<Customer> customerList = customerDao.selectByExample(example);
		return customerList;
	}
}
