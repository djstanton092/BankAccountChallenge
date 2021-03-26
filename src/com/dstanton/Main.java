package com.dstanton;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount bob = new BankAccount();

        bob.setCustomerName("Bob D Builder");
        bob.setEmail("bob@builder.com");
        bob.setPhoneNumber("1-800-BUILDER");
        bob.setBalance(100.00);
        bob.setAccountNumber(12345);

        bob.printAccountInfo();

        bob.depositFunds(50.0);

        bob.printAccountInfo();

        bob.withdrawlFunds(50.0);

        bob.printAccountInfo();

        bob.withdrawlFunds(300.00);



    }


}
