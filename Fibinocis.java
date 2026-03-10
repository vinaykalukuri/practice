import java.util.*;
class Fibinocis{
   static  void ss(int a){
        int n1=0,n2=1,n3;

        for(int i=1;i<=a;i++){
        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
        
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       
        ss(a);

    }
}
