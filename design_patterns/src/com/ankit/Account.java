package com.ankit;

public class Account {
    private float balance=0;

    public float getBalance(){
        return this.balance;
    }

    public void withdraw(float amount){
        if(amount > 0 && this.balance-amount > 0){
            this.balance -= amount;
        }
    }

    public void deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
}
