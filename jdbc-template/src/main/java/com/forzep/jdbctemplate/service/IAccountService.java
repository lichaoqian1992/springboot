package com.forzep.jdbctemplate.service;

import com.forzep.jdbctemplate.dto.Account;

import java.util.List;

public interface IAccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
