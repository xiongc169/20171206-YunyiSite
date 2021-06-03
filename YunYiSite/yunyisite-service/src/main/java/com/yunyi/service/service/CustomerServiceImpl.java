package com.yunyi.service.service;

import java.util.List;

import com.yunyi.domain.wong_user.Customer;
import com.yunyi.domain.wong_user.CustomerExample;
import com.yunyi.service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yunyi.dao.wong_user.CustomerMapper;

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
