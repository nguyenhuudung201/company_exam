package com.class1;

public class Wallet {
    int amount;

    Wallet(){
        this.amount = 0;
    }

    public void deposit(int money) {
        this.amount += money;
    }

    public boolean payMoney(int sum) {
        if(sum<= this.amount) {
            this.amount -= sum;
            return true;
        }

        return false;
    }
}
