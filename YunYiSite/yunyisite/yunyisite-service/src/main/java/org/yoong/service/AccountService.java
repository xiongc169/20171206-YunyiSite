package org.yoong.service;

import org.yoong.wong_user.domain.Account;
import org.yoong.wong_user.domain.Customer;

import java.util.List;

public interface AccountService {

    int addAccount(Account account);

    int addAccount(Customer customer, Account account);

    List<Account> getAccount();

}
