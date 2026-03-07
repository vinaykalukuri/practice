import java.util.*;
class MovieTicket{
     int n;
    static  void age(int n ){
       
        if(n<=5){
            System.out.println("Ticket is free");

        }
        else if (6<=n && n<18){
            System.out.println("Ticket price is : 100rs");
        
        }
        else if (18<n&&n<60){
            System.out.println("Ticket price is :200rs");
        }
        else {
            System.out.println("Ticket price is :120rs");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        age(n);
        System.out.println();
    }
}
