package com.forzep.jdbctemplate.controller;

import com.forzep.jdbctemplate.dto.Account;
import com.forzep.jdbctemplate.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountService accountService;

    @GetMapping("/list")
    public List<Account> getAccounts() {
        return accountService.findAccountList();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    @PutMapping("/{id}")
    public String updateAccount(@PathVariable("id")int id,
                                @RequestParam String name, @RequestParam double money) {
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t = accountService.update(account);
        if(t == 1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @PostMapping("")
    public String postAccount(@RequestParam String name, @RequestParam double money) {
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        int t= accountService.add(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }
    }
}
