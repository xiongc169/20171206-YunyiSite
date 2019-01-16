package org.yoong.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yoong.service.AccountService;
import org.yoong.wong_user.domain.Account;
import org.yoong.wong_user.domain.Customer;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * http://localhost:8090/account/add
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/add")
    public String addAccount() {
        Account account = new Account();
        account.setAccountId("ac-123456789");
        account.setContactName("xiaoshan");
        int effectRows = accountService.addAccount(account);
        return "Success";
    }

    /**
     * http://localhost:8090/account/transaction
     *
     * @return
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
        return "Success";
    }

    @ResponseBody
    @RequestMapping("/get")
    public String getAccount() {
        List<Account> effectRows = accountService.getAccount();
        return "Success";
    }

}
