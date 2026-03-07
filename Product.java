
import java.util.Scanner;

class Product{
       String productname ;
    
         Product(String productname){
        if (productname.equals("brush"))
            {
            int productId = 12345;
            int price = 250 ;
             int Discount = (price*10)/100;
             System.out.println(productId);
              System.out.println(price);
               System.out.println("After discount :"+ Discount);
        }
            else {
                 System.out.println("out of stock ");
            }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String productname = sc.nextLine();
        Product n = new Product(productname);
    
         System.out.println();
    }

}