import java.util.*;
class BankAccount{
    static int Acno;
    static String name;
    static double balance;
    static double amount;
    
    
    public BankAccount(int Acno,String name, double balance){
        this.Acno= Acno;
        this.name=name;
        this.balance=balance;
        

    }
   static  void deposit(double  amount){
    
         balance =  balance+amount;

       
        System.out.println(balance);
    }
    
    static  void withdrawal(double amount){
       
        balance = balance-amount;
        System.out.println(balance);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name :");
        String n = sc.nextLine();
        
        System.out.println("enter your number :");
        Acno =sc.nextInt();
        System.out.println("enter your balance:");
        double ba= sc.nextDouble();
        BankAccount as = new BankAccount(Acno,n,ba);
        System.out.println("enter your option :"+1+"deposit"+"\n"+2+"wihtdrawal");

        
        int option = sc.nextInt();
        
            
        if(option==1){

            System.out.println("enter your amount");
            amount=sc.nextInt();
            deposit(amount);
            deposit(amount);
            
            

        }
           
            
            
        else if(option==2){
            
           System.out.println("enter your amount");
           amount=sc.nextInt();
            withdrawal(amount);
        }
        else{
            System.out.println("invalid option");
        }
       
        
        System.out.println(Acno+"\n"+name+"\n"+balance);
        
        
          
        
        
    }
}
