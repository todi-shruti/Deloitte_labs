package com.deloitte.lab4.ex1;

class Person {
    private String name;
    private float age;

    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
}

class Account {
    private static long nextAccNum = 1;
    private long accNum;
    private double balance;
    private Person accHolder;

    public Account(Person accHolder, double balance) {
        this.accNum = nextAccNum++;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance - amount >= 500) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance. Minimum balance of INR 500 is required.");
        }
    }
}

class SavingsAccount extends Account {
    private static final double MINIMUM_BALANCE = 500;

    public SavingsAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() - amount >= MINIMUM_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance. Savings Account requires a minimum balance of INR " + MINIMUM_BALANCE + ".");
        }
    }
}


class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Person accHolder, double balance, double overdraftLimit) {
        super(accHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}


public class Lab4Ex1 {
    public static void main(String[] args) {
        // a) Create accounts for Smith and Kathy
        Person smith = new Person("Smith", 30);
        Person kathy = new Person("Kathy", 25);

        Account smithAccount = new Account(smith, 2000);
        Account kathyAccount = new Account(kathy, 3000);

        // b) Deposit to Smith's account
        smithAccount.deposit(2000);

        // c) Withdraw from Kathy's account
        kathyAccount.withdraw(2000);

        // d) Display updated balances
        System.out.println("Smith's Account Updated Balance: INR " + smithAccount.getBalance());
        System.out.println("Kathy's Account Updated Balance: INR " + kathyAccount.getBalance());

        // e) Inheritance and polymorphism
        SavingsAccount savingsAccount = new SavingsAccount(smith, 1000);
        CurrentAccount currentAccount = new CurrentAccount(kathy, 2000, 500);

        savingsAccount.withdraw(200);
        currentAccount.withdraw(2300);

        System.out.println("Smith's Savings Account Balance: INR " + savingsAccount.getBalance());
        System.out.println("Kathy's Current Account Balance: INR " + currentAccount.getBalance());
    }
}
