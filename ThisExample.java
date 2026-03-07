import java.util.*;
class ThisExample{
    String name;
    int rolno;

    public ThisExample(String name,int rolno){
        this.name=name;
        this.rolno=rolno;

    }
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int rol=sc.nextInt();
        ThisExample t = new ThisExample(name,rol);
        System.out.println(name);
        System.out.println(rol);

    }
}