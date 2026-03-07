import java.util.*;

class Prime{
    int n;
    static void primeNum(int n)
    {
        int flag=0;

        if ( n==0||n==1)
        System.out.println("it is not a prime number");
        else{
            for(int i=2;i<=n-1;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+"it is not a prime number");
                    flag=1;
                    break;
                }
                
            }
             if(flag==0)
        {
            System.out.println(n+"it is  a prime number");
        }
        }
       
    }
    public static void main(String args[])
    {
        Scanner nakistam =new Scanner(System.in);
        int n = nakistam.nextInt();
        primeNum(n);
    }
    
}