/*College Management (Hierarchical Inheritance)
Person
name
age
Student extends Person
rollNumber
Professor extends Person
subject  */

import java.util.*;
class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name=name;
        this.age = age;
    }
}
class Student extends Person{
    public Student(String name, int age){
        super( name, age);
        int rollNumber= 123456;
        System.out.println(rollNumber);
        
    }
   
   

    
}
class Professor extends Person{
    public Professor(String name, int age){
    super(name, age);
    String subject = "java";
    System.out.println("subject name"+subject);
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter professor name");
        String name1 = sc.nextLine();
        System.out.println("enter student name");
        String name = sc.nextLine();
        System.out.println("enter student age");
        int age = sc.nextInt();
       
        Student ss = new Student(name, age);
        
        System.out.println("enter professor age");
        int age1 = sc.nextInt();
        Professor  pp = new Professor(name1, age1);

        
    }


}