import java.util.*;
class ConstructorSample
{
    public  ConstructorSample(int a,int b){
       int sum = a+b;
       System.out.println(sum);

    }
    public  ConstructorSample(float c , float d){
        float sum = c+d;
        System.out.println(sum);

    }
        
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        
        int a = sc.nextInt();
        int b =sc.nextInt();
        float c =sc.nextFloat();
        float d =sc.nextFloat();
        ConstructorSample addition = new ConstructorSample(a,b);
        ConstructorSample f = new ConstructorSample(c,d);   

    } 
}