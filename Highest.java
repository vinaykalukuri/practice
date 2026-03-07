import java.util.*;
class Highest{
    public static void main(String args[]){
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
            {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
            {
            System.out.println(a[i]);
        }
        int v =a[0];
        for(int i=0;i<5;i++){
            if(v<a[i]){
                v=a[i];
            }
            
        }
        System.out.println("highest value is :"+v);
    }
}
