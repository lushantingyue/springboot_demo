package com.example.demo_spring_jpa.service;

import com.example.demo_spring_jpa.bean.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountService {

    List<Account> findAccountList();

    Account findAccountById(int id);

    String update(Account account);

    String add(Account account);
}
