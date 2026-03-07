import java.util.*;
class Scannerhjkl{
     static void learn(int a,int b){
       int sum=a/b;
            System.out.println(sum);
        
    }
    public static void main(String args[]){
        Scanner naistam =new Scanner(System.in);
        int a = naistam.nextInt();
        int b = naistam.nextInt();
        learn(a,b);
    }
}