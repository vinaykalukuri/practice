/*You are building a shopping cart.
Product class → productName, price
Cart extends Product
👉 Tasks
Store 5 product prices in an array.
Use loop to calculate total cost.
If total > 5000 → apply 10% discount. */
import java.util.*;
class Product{
    String productName;
    
    public Product(String productName){
        this.productName = productName;
       
    }


}
class Cart extends Product{

    public Cart(String productName){
        super(productName);
    }
    void prices(){
        int a[]=new int[5];
        a[0] = 1000;
        a[1] = 2000;
        a[2] = 3000;
        a[3] = 4000;
        a[4] = 5000;

         int sum = 0;
         for (int i = 0;i<a.length ; i++){
            sum = sum+a[i];
            
         }
         System.out.println( sum);
         if (sum>5000){
            int discount = (sum*10)/100;
            int totalbill = sum-discount;
            System.out.println("after discount"+totalbill);
         }
    }
        public static void main(String[] args) {
            
        
         { 
            Scanner s = new Scanner(System.in);
            String productName = s.nextLine();
            


            Cart cc = new Cart(productName );
            System.out.println("your shopping bill :");
            cc.prices();

         }

    }

}