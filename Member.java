 /*{Gym Membership System

Create Member class:

name

membershipType (Monthly / Quarterly / Yearly)

fee

👉 Constructor initializes name & membershipType
👉 Method calculateFee():

Monthly → ₹1000

Quarterly → ₹2500

Yearly → ₹8000

If age > 50 → 20% discount*/

import java.util.*;
class Member
{
     String n;
    static String membership;
    static int fee;
   static int age;

    
    public  Member(int age,String n ,String membership){
      this.n=n;
      this.membership=membership;
      this.age=age;
 }
    static void caluculateFee(){
        if (membership.equals("monthly"))
        {
            if(age>49){
                fee=1000;
                int discount=(fee/20)/100;
                System.out.println("your fees:"+ discount);

            }else
                {
            fee = 1000;
            System.out.println("your fees:"+fee);
            }
        }
        else if (membership.equals("quaterly")){
            if (age>49){
                 fee=2500;
                int discount=(fee/20)/100;
                System.out.println("your fees:"+ discount);

            }else
                {
            fee = 2500;
            System.out.println("your fees:"+fee);
            }

        }
        else if(membership.equals("yearly")){
            if (age>49){
                fee=8000;
                int discount=(fee/20)/100;
                System.out.println("your fees:"+ discount);

            }else
                {
            int fee = 8000;
            System.out.println("your fees:"+fee);
            }
        }
        else
        {
            System.out.println("invalid ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String n=sc.nextLine();
        System.out.println("enter your membership: ");
        String membership=sc.nextLine();
        
       
       System.out.println("enter your age: ");
        int age = sc.nextInt();
        
        Member ji = new Member(age,n,membership);

        caluculateFee();
        
    }
    }
