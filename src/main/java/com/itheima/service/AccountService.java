package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    boolean transMoney(String form, String to, Double money);
}
