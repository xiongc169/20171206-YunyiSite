package org.yoong.service;

import java.util.List;

import org.yoong.domain.Account;
import org.yoong.domain.Customer;

public interface AccountService {

	int addAccount(Account account);

	int addAccount(Customer customer, Account account);

	List<Account> getAccount();

}
