package com.dz;

public class ATM implements Runnable {
    private final Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void run() {
        try {
            int o = (int) (Math.random() * 2);
            int amount = (int)(( Math.random() * 1500));
            if (o == 1) {
                account.replenish(amount);
                Thread.sleep(30);
            }
            else {
                account.withdraw(amount);
                Thread.sleep(30);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
