package com.yunyi.web.controller;

import com.yunyi.domain.wong_user.Account;
import com.yunyi.domain.wong_user.Customer;
import com.yunyi.service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Desc AccountController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2016年7月20日
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * http://localhost:8090/account/add
     */
    @ResponseBody
    @RequestMapping("/add")
    public String addAccount() {
        Account account = new Account();
        account.setAccountId("ac-123456789");
        account.setContactName("xiaoshan");
        int effectRows = accountService.addAccount(account);
        System.out.println(effectRows);
        return "Success";
    }

    /**
     * http://localhost:8090/account/transaction
     */
    @ResponseBody
    @RequestMapping("/transaction")
    public String transaction() {
        Customer customer = new Customer();
        customer.setCustomerId("cu-123456789");
        customer.setCustomerName("Deng");

        Account account = new Account();
        account.setAccountId("ac-123456789");
        account.setContactName("xiaoshan");

        int effectRows = accountService.addAccount(customer, account);
        System.out.println(effectRows);
        return "Success";
    }

    /**
     * http://localhost:8095/account/get
     */
    @ResponseBody
    @RequestMapping("/get")
    public String getAccount() {
        List<Account> accounts = accountService.getAccount();
        System.out.println(accounts.size());

        accounts = accountService.getAccount();
        System.out.println(accounts.size());
        return "Success";
    }

}
