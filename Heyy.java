 import java.util.*;
 class Vinayss{
    int s ;
    public Vinayss(int s ){
        this.s= s;

    }
    void display(){
        
        System.out.println(s);
    }
 }

 class Saiaa extends Vinayss{
    

   public Saiaa(int s ){
    super(s); 
    super.display();

   }



 }
 class Heyy
 {
    public static void main(String args[]){
    
    Scanner s=new Scanner(System.in);
    int si= s.nextInt();
    Saiaa a=new Saiaa(si);
    }
 }