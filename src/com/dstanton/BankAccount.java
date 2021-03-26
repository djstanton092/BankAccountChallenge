package com.dstanton;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println(amount + " deposited.");
    }

    public void withdrawlFunds(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Inssufficent funds.");
        }
    }


    public void printAccountInfo() {
        System.out.printf("customerName = %s%nemail = %s%nphoneNumber = %s%nbalance = %f%naccountNumber = %d %n",
                this.getCustomerName(),
                this.getEmail(),
                this.getPhoneNumber(),
                this.getBalance(),
                this.getAccountNumber()
        );

    }

}
