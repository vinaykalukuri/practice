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
    String accountholder;
    int balance ;
    public Account(String accountholder,int balance){
        this.accountholder= accountholder;
        this.balance=balance;
    }
   void  showBalance(){
    System.out.println("balance:"+balance);
    }
}
class CurrentAccount extends Account
{
    public CurrentAccount(String accountholder,int balance){
        super(accountholder,balance);

    }
    void overdraftLimit(){
        int overdraftLimit= 20000;
        System.out.println("overdraft limit is:"+overdraftLimit);

    }
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        String accountholder = sc.nextLine();
        System.out.println(accountholder);
        int balance = sc.nextInt();
        System.out.println(balance );
        CurrentAccount cc = new CurrentAccount(accountholder,balance);
        cc.overdraftLimit();
    }
}