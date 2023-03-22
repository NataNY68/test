package oop.polymorphism;

public class Bank extends Branch{

    @Override
    public void deposit(){
        System.out.println("Deposit at Bank");
    }

    public void loan(){
        System.out.println("Loan from BANK up to 5M");
    }

    public void openBranch(){
        System.out.println("Bank open  Branch");
    }

}
