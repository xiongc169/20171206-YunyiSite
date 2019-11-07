package com.yunyi.service.service;

import com.yunyi.domain.wong_user.Account;
import com.yunyi.domain.wong_user.Customer;

import java.util.List;

public interface AccountService {

    int addAccount(Account account);

    int addAccount(Customer customer, Account account);

    List<Account> getAccount();

}
