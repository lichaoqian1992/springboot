package com.forzep.jpa.service.impl;

import com.forzep.jpa.dao.AccountDao;
import com.forzep.jpa.entity.Account;
import com.forzep.jpa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public List<Account> getAccounts() {
        return accountDao.findAll();
    }

    @Override
    public Account getAccountById(int id) {
        return accountDao.findOne(id);
    }

    @Override
    public String updateAccount(Account account) {
        Account account1 = accountDao.saveAndFlush(account);
        return account1.toString();
    }

    @Override
    public String postAccount(String name, double money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        Account account1 = accountDao.save(account);
        return account1.toString();
    }
}
