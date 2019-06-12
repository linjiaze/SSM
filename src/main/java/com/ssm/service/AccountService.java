package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    boolean transMoney(String form, String to, Double money);
}
