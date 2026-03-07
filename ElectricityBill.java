import java.util.*;
class ElectricityBill{
    int n ;
    static void units(int n){
        if (n<=100)
            {
            int charge = n*5;
            System.out.println("your bill is :"+charge);
            }
        else if (n>=101){
            int charge = n*7;
            System.out.println("your bill is "+charge);
        }

        else {
            int charge = n*10;
            System.out.println("your bill is :"+charge);
        }
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        units(n);
        System.out.println();
    }
}