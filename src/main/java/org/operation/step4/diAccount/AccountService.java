package org.operation.step4.diAccount;

import org.operation.step4.di.Inject;

public class AccountService {

    @Inject
    AccountRepository accountRepository;

    public void join() {
        accountRepository.save();
        System.out.println("join!!!!!!");
    }
}
