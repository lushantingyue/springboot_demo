package com.example.demo_spring_jpa.service;

import com.example.demo_spring_jpa.bean.Account;
import com.example.demo_spring_jpa.dao.AccountDao;
import com.mysql.jdbc.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class AccountService implements IAccountService{

    @Autowired
    AccountDao accountDao;

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAll();
    }

    @Override
    public Account findAccountById(int id) {
//        Account instance = accountDao.getOne(id);
        Optional<Account> instance = accountDao.findById(id);
        Account res = instance.get();

        return res;
    }

    @Override
    public String update(Account account) {
        Account instance = accountDao.saveAndFlush(account);

        return instance.toString();
    }

    @Override
    public String add(Account account) {
        Account instance = accountDao.save(account);

        return instance.toString();
    }
}
