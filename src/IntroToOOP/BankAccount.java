package IntroToOOP;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    // These are attribute of this entity
    // this is attribute blueprint for each entity
    // Access modifier are used here to restrict access from outside of this class

    private double balance;
    private String ownerName;
    private List<String> transactionsLog;


    // these are constructor which used to initialize the blueprint attributes
    public BankAccount(double balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.transactionsLog = new ArrayList<>();
    }

    public BankAccount() {
        this.balance = 0;
        this.ownerName = "Unknown";
        this.transactionsLog = new ArrayList<>();
    }

    // why need to have setter and setter method, which can be used from outside to set value of private access modifier

    // here the object has controler about which values should be allowed to set/get
    // a custom logic can be written by class owner to valid the incoming value before setting/getting values 
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }
        transactionsLog.add("Deposited: " + amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || balance < amount) {
            System.out.println("Insufficient funds");
            throw new RuntimeException("Insufficient funds");
        }
        balance -= amount;
        transactionsLog.add("Withdrawn: " + amount);
    }

    public void printTransactionHistory() {

        for (String transaction : transactionsLog) {
            System.out.println(transaction);
        }

    }

    public void printDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }

}

