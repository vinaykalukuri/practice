import java.util.*;
class Example{
    static int a,b;
   static void tng()
    {
    
        int sum = a+b;
        System.out.println(sum);

    }
    static void dng( ){
       int  mul=a*b;
       System.out.println(mul);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        a = sc.nextInt();
         b = sc.nextInt();
        tng();//method call
        dng();
        System.out.println();
    }
}