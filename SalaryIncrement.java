import java.util.Scanner;

class SalaryIncrement{
   static  int salary ;
    static void paisalu(int salary){
        int sum;
        for(int i=1;i<=5;i++){
            int increment  =(salary*10)/100;
            int extra = i*increment+salary;
            System.out.println(extra);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        paisalu(salary);
        System.out.println();
    }
}