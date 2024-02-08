package com.banking.service;

import com.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double balance);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccount();

    void deleteAccount(Long id);
}
