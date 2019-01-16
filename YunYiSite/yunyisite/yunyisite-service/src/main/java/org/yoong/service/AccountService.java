package org.yoong.service;

import java.util.List;

public interface AccountService {

	int addAccount(Account account);

	int addAccount(Customer customer, Account account);

	List<Account> getAccount();

}
