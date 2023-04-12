package com.class1;
import java.util.Scanner;
public class Person {
    Wallet wallet;
    int Id = 0;
    //Default Constructor
    Person() {
        this.wallet = new Wallet();
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your money ");

        int money = scanner.nextInt();
        this.wallet.deposit(money);
        System.out.println("Money: "+money);

    }

    public int calcTotal (int[] bills)
    {
        int sum = 0;
        for (int i = 0; i < bills.length; i++) {
            sum += bills[i];
        }
        return sum;
    }

    public boolean payMoney(int sum) { //600
        return this.wallet.payMoney(sum);
    }
}
