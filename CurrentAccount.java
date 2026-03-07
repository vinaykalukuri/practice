/* Account
accountHolder
balance
constructor
method showBalance()
CurrentAccount extends Account
overdraftLimit
constructor (use super)
method showAccountDetails() */


import java.util.*;
class Account{
    String accountHolder;
    int balance ;
    public Account(String accountHolder,int balance){

        this.accountHolder=accountHolder;
        this.balance=balance;
    }
   void  showBalance(){
    System.out.println("balance:"+balance);
    }
    void accountNumber(){
        int accountNumber = 12345678;
        System.out.println("account number is:"+accountNumber);
    }
}
class CurrentAccount extends Account
{
    public CurrentAccount(String accountHolder,int balance){
        super(accountHolder,balance);

    }
    void showAccountDetails() {
        System.out.println(accountHolder);
        super.accountNumber();
         super.showBalance();
        int overdraft = 100000;
        System.out.println("overlimit"+overdraft);

    }
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        String accountHolder = sc.nextLine();
       
        int balance = sc.nextInt();
       
        CurrentAccount cc = new CurrentAccount(accountHolder,balance);
        cc.showAccountDetails();
        
    }
}