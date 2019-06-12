package com.ssm.service.impl;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lin
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    @Transactional
    public boolean transMoney(String form, String to, Double money) {
        Double remaining = accountDao.findRemainingByName(form);
        if (remaining < money) {
            return false;
        }

        boolean b1 = accountDao.addMoney(form, -money);
        boolean b2 = accountDao.addMoney(to, money);
        return b1 & b2;
    }
}
