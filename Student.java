
import java.util.Scanner;

/*A college stores marks of students.

Person class → name

Student class extends Person → rollNumber and marks array

👉 Tasks

Store 5 subject marks in an array.

Use a loop to calculate total marks.

Use if condition to determine result:

Above 75 → Distinction

Above 50 → Pass

Below 50 → Fail */


class Person{
    String name;
    public Person(String name){
        this.name= name;

    }
}
class Student extends Person{
    public Student(String name){
        super(name);
        int rollno = 2002345;
        System.out.println(rollno);

    }
    void marks(){
        
    int a[]=new int [5];
    a[0]=40;
    a[1]=4;
    a[2]=20;
    a[3]=10;
    a[4]=47;
    int sum = 0;
    for (int  i = 0; i<a.length;i++){
        System.out.println("marks"+a[i]);
        
        sum= sum+a[i];
        
    }
    System.out.println("total marks"+sum);
    
    if(sum>75){
        System.out.println("Distinction");
    }
    else if(sum>50&&sum<75){
        System.out.println("pass");
    }
    else{
        System.out.println("fail");
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        Student ss = new Student(name);
        ss.marks();

    }
}
