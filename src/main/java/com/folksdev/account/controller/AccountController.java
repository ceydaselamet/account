package com.folksdev.account.controller;

import com.folksdev.account.dto.AccountDto;
import com.folksdev.account.dto.CreateAccountRequest;
import com.folksdev.account.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@Valid @RequestBody CreateAccountRequest request){
        return ResponseEntity.ok(accountService.createAccount(request));
    }
}
