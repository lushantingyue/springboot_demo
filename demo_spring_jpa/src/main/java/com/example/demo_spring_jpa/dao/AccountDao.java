package com.example.demo_spring_jpa.dao;

import com.example.demo_spring_jpa.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 数据访问层接口, Account是对象名, Integer是主键类型
 */
public interface AccountDao extends JpaRepository<Account, Integer> {

}
