class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        int a =79, b=40;
        int c =40, d=30;
        Calculator calc = new Calculator();
        calc.sum(a,b);
        System.out.println(calc.multiply(a,b));
        System.out.println(calc.sub(a,d));
        System.out.println(calc.sum(c,d));
        System.out.println(calc.div(a,c));
    }
    int sub(int a, int b){
        return a-b;
    }
   int div(int a, int b){
        return a/b;
}
 
 int multiply(int a, int b){
        return a*b; 
    }
}
