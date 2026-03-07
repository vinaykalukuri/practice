import java.util.Scanner;
class EmployeeSalary{
   static String name;
   static int salary;
     EmployeeSalary(String name,int salary){
        int basicsalary=salary;
        
        this.name= name;
        int hra= (basicsalary*12)/100;
        int da=(basicsalary*8)/100;
        double salary1 = basicsalary+hra+da;
        System.out.println(salary1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         name = sc.nextLine();
         salary = sc.nextInt();
        
        EmployeeSalary e =new EmployeeSalary(name,salary);
        System.out.println();

    }
}
