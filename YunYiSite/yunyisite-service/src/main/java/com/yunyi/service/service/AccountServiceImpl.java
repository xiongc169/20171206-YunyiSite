package com.yunyi.service.service;

import java.util.List;

import com.yunyi.domain.wong_user.Account;
import com.yunyi.domain.wong_user.AccountExample;
import com.yunyi.domain.wong_user.Customer;
import com.yunyi.service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yunyi.dao.wong_user.AccountMapper;
import com.yunyi.dao.wong_user.CustomerMapper;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountDao;

    @Autowired
    private CustomerMapper customerDao;

    @Override
    public int addAccount(Account account) {
        int effectRows = accountDao.insertSelective(account);
        return effectRows;
    }

    @Override
    @Transactional
    public int addAccount(Customer customer, Account account) {
        int effectRows = 0;
        effectRows = customerDao.insertSelective(customer);
        account.setCustomerId(customer.getCustomerId());
        //double div = 100 / 0;
        effectRows += accountDao.insertSelective(account);
        return effectRows;
    }

    @Override
    public List<Account> getAccount() {
        AccountExample example = new AccountExample();
        List<Account> accountList = accountDao.selectByExample(example);
        return accountList;
    }

}
