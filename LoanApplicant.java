import java.util.Scanner;
class LoanApplicant
{
     static int age;
     static int salary;
     static int creditscore;
     

        public LoanApplicant(int age, int salary ,int creditscore)
        {
            this.age=age;
            this.salary=salary;
            this.creditscore=creditscore;
            

        }
       static void  checkEligibility(){
            if((age>=21)&&(salary>=25000)&&(creditscore>=700)){
                System.out.println("you are eligible");
            }
            else{
                System.out.println("you are  not eligible");
            }

       }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your name ");
            String name=sc.nextLine();
           System.out.println("enter your age");
            int age =sc.nextInt();
            System.out.println("enter your salary");
            int salary = sc.nextInt();
            System.out.println("enter your creditscore");
    
            int creditscore = sc.nextInt();
            
            LoanApplicant hi =new LoanApplicant(age,salary,creditscore);
            
            checkEligibility();



        }

}
