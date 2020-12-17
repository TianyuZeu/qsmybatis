package com.qianshan.dao;

import com.qianshan.entity.Account;

import java.util.List;

public interface AccountDao {
    public int save(Account account);
    public int deleteById(long id);
    public int update(Account account);
    public List<Account> findAll();
    public Account findById(long id);
}
