package com.dz;

public class Account {
    Person person;
    private int balance;

    public Account(Person person, int balance) {
        this.person = person;
        this.balance = balance;
    }

    public synchronized void replenish(int amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Операция пополнение на " + amount + " - успешно совершена");
            printBalance();
        }
        System.out.println("Поток " + Thread.currentThread().getName());
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Операция снятие " + amount + " - успешно совершена");
            printBalance();
        }
        else
            System.out.println("На счете недостаточно средств для снятия " + amount);
        System.out.println("Поток " + Thread.currentThread().getName());
    }

    public void printBalance() {
        System.out.println("Баланс на счете: " + getBalance());
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
