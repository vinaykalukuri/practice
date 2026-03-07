class MultiplicationTable{
    public static void printmultiplicationtable(int n){
        System.out.println("Multiplication Table of " +":");
        for (int i = 1; i <=10; i++) {
            int result = n*i;
            System.out.println(n+"x"+i+"="+result);
        }

    }
    
    public static void main(String args[]) {
      
        int number = 5;
       printmultiplicationtable(number);
            
        }
    }
   
    
