package object;

public class BankAccount {
    String accountHolderName ;
    String bankName = "chase" ;
    double balance ;
    String userName;
    String password;
    boolean isLoggedIn;


    //create a method that will initialize instance fields
    //void method SignUp

    public void signUp( String accountHolderName1, String userName1, String password1, int balance1){
        accountHolderName=accountHolderName1;
        userName=userName1;
        password=password1;
        balance = balance1;

        System.out.println("Sign Up process is done!");
    }

    public void displayInfo(){

        if (isLoggedIn){
            System.out.println("Account Holder Name: " + accountHolderName
                    +"\nBank Name:" + bankName + "\nisLoggedIn " + isLoggedIn + "\nbalance is "+balance);
        }else {
            System.out.println("Should be login first to see info");
        }
    }

    public double deposit(int depositAmount){
        if(isLoggedIn) {
            balance += depositAmount;
            System.out.println("your balance after depositing " + depositAmount + " >>>> " + balance);
            return balance;
        }return balance;
    }

    public double withdraw(double withdrawAmount){
        balance-=withdrawAmount;
        System.out.println("your balance after withdrawing "+ withdrawAmount + " >>>> "+ balance);

        return  balance;
    }

    public void logIn(String userName1, String password1){
        if(userName.equals(userName1) && password.equals(password1)){
            isLoggedIn = true;
            System.out.println("You successfully login to the account");

            System.out.println("INFORMATION AFTER LOGIN");
            displayInfo();
        }else {
            System.out.println("Please check username or password");
            isLoggedIn = false;       }
    }











}
