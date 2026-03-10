import java.util.*;
class fibinocis{
    static void poo(int a){
        int n1=0,n2=1,n3;

        for(int i=1;i<=a;i++){
        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
        
        }
    } 
    public static void main(String[] args) {
        Scanner niistam=new Scanner(System.in);
        int a=niistam.nextInt();
        poo(a);

    }
}
