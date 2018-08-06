package com.forzep.jpa.service;

import com.forzep.jpa.entity.Account;

import java.util.List;

public interface AccountService {

    public List<Account> getAccounts();

    public Account getAccountById(int id);

    public String updateAccount(Account account);

    public String postAccount(String name, double money);
}
