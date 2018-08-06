package com.forzep.jpa.dao;

import com.forzep.jpa.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account,Integer> {
}
