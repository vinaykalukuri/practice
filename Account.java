import java.util.*;
class Account{
     int accountnumber;
     double balance;
    
    public  Account(int accountnumber,double balance){
        this.accountnumber = accountnumber;
         this.balance = balance;

    }
    
    
     void deposit(double amount){
    
    balance=balance+amount;
    System.out.println(balance);
   }
   void withdrawal(double amount){
    if(amount>0){
        balance=balance-amount;
    }
    
    System.out.println(balance);
   }

}
class SavingsAccount extends Account {
    SavingsAccount(int accountnumber, double balance) {
        super(accountnumber, balance);  
    }
    
    static void intrestRate(double  amount){
        
        double intrest = (8*0.1);
    
        double intrestrate=amount*intrest;
    }
    
    
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter account number");
        int accountnumber = sc.nextInt();
        System.out.println("enter your balance");
        int balance = sc.nextInt();
        System.out.println("enter your option");
       
        SavingsAccount acc = new SavingsAccount(accountnumber, balance);
        int option = sc.nextInt();
        if(option==1){
            
             double amount = sc.nextDouble();
             acc.deposit(amount);
             intrestRate(amount);
             
    }
    
    }
    
}