/*Accessing Parent Class Variable

Scenario:
A company has a base salary for employees. A developer gets an additional bonus. Print both base salary and total salary. */
class Employee{
    float salary=500000;

    void salary()
    {
        
        System.out.println("base salary " + salary);

    }
    

} 
class Developer extends Employee{
    
    void bonus(){
        int   bonus = 10000;
        float a = super.salary;
        float totalsalary = a + bonus;
        System.out.println(totalsalary +"bonusSalary");
    }
    public static void main(String args[]){
        Developer dd = new Developer();
        dd.bonus();
        dd.salary();
        
       

    }
}