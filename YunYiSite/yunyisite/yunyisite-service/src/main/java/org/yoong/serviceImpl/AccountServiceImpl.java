package org.yoong.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yoong.dao.AccountMapper;
import org.yoong.dao.CustomerMapper;
import org.yoong.domain.Account;
import org.yoong.domain.AccountExample;
import org.yoong.domain.Customer;
import org.yoong.service.AccountService;

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
		// effectRows = customerDao.insertSelective(customer);
		// account.setCustomerId(customer.getCustomerId());
		// double div = 100 / 0;
		// accountDao.insertSelective(account);
		return effectRows;
	}

	@Override
	public List<Account> getAccount() {
		AccountExample example = new AccountExample();
		List<Account> accountList = accountDao.selectByExample(example);
		return accountList;
	}

}
