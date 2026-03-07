import java.util.*;
class StaticExample{
    static int a=10;
    static void mul(int b)
    {
        int mul=a*b;
        System.out.println(mul);
    }
    public static  void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        mul(b);
    } 
}