package com.dstanton;

public class Main {

    public static void main(String[] args) {
//        BankAccount bob = new BankAccount();
//
//        bob.setCustomerName("Bob D Builder");
//        bob.setEmail("bob@builder.com");
//        bob.setPhoneNumber("1-800-BUILDER");
//        bob.setBalance(100.00);
//        bob.setAccountNumber(12345);
//
//        bob.printAccountInfo();
//
//        bob.depositFunds(50.0);
//
//        bob.printAccountInfo();
//
//        bob.withdrawlFunds(50.0);
//
//        bob.printAccountInfo();
//
//        bob.withdrawlFunds(300.00);

        VipCustomer elon = new VipCustomer();
        VipCustomer Jeff = new VipCustomer("Jeff Bezos", 666.66);
        VipCustomer Bill = new VipCustomer("Bill Gates", 1000.00, "bill.gates@micorofarce.com");

        printVIP(elon);
        printVIP(Jeff);
        printVIP(Bill);

    }

    public static void printVIP(VipCustomer aVIP){
        System.out.println(aVIP.toString());

        System.out.println("==========================");
        System.out.printf("Name = %s%nCreditLimit = %f%nEmail = %s%n",
                aVIP.getName(), aVIP.getCreditLimit(), aVIP.getEmailAddress());
        System.out.println("==========================");
    }
}
