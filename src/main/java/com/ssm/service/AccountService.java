package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

public interface AccountService {

    /**
     * 查询所有账户信息
     *
     * @return
     */
    List<Account> findAll();

    /**
     * 转账
     *
     * @param form
     * @param to
     * @param money
     * @return
     */
    boolean transMoney(String form, String to, Double money);
}
