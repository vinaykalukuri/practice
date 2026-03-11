 import java.util.Scanner;
 class AtmPin
 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 1234;
        int count = 0;
            
        
        if(n!=y) 
            {
            
            for(int i=1;i<=3;i++){
                 System.out.println("enter the pin");
                 n = sc.nextInt();
                count++;

            }
            if (count==2){
                System.out.println("Access denied");
            }


            }   
        

           
            
        
        else {
            System.out.println("Access sucess ");
        }
        System.out.println();
    }
 }    
       
        
   
    
 
