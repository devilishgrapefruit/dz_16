package com.dz;

public class ATM implements Runnable {
    private final Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void run() {
        try {
            int o = (int) (Math.random() * 4);
            int amount = (int)(( Math.random() * 1500));
            if (o == 1) {
                account.replenish(amount);
                Thread.sleep(30);
            }
            else if (o == 2){
                account.withdraw(amount);
                Thread.sleep(30);
            }
            else {
                account.replenish(amount);
                account.withdraw(amount + (int) (Math.random() * 100));
                Thread.sleep(30);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
