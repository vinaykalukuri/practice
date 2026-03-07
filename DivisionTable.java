class DivisionTable{
    static void Division(int n)
    {
        System.out.println("The division table of :");
        for(int i=1;i<=10;i++){
            int result=n/i;
            System.out.println(n+"/"+i+"="+result);
        }
    } static void main(String args[]){
        int n=100;
        Division(n);
    }
}