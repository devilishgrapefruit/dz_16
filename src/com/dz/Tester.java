package com.dz;

public class Tester {
    Account account = new Account(new Person("Иван"), 500);
    ATM atm1 = new ATM(account);
    ATM atm2 = new ATM(account);
    ATM atm3 = new ATM(account);

    public void go(){
        account.printBalance();
        new Thread(atm1).start();
        new Thread(atm2).start();
        new Thread(atm3).start();
    }
}
