package com.example.demo_spring.web;

import com.example.demo_spring.bean.Account;
import com.example.demo_spring.service.AccountService;
import com.example.demo_spring.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountService accountService;

    /**
     * 查询list数据
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return accountService.findAccountList();
    }

    /**
     * 查询单个数据
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    /**
     * 更新单个数据
     * @param id
     * @param name
     * @param money
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccountById(@PathVariable("id") int id,
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t = accountService.update(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

    /**
     * 增加单个数据
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name", required = true)String name,
                              @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        int t = accountService.add(account);
        if (t ==1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

}
