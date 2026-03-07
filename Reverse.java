import java.util.*;
class Reversed {
    public static void main(String args[])
    { 
        System.out.println("enter a number :");
        Scanner sc =new Scanner(System.in);
        int original = sc.nextInt();
        
    int answer =0;
    while(original>0)
        {
         
        answer = answer*10+original%10;
        original = original/10;
            
        }
        System.out.println(answer);
    }

}