/*🔹 Problem 2: Appliance → WashingMachine
Scenario:
Base class Appliance
brand
power
constructor
method showApplianceInfo()
Child class WashingMachine
capacity
constructor (use super)
method showMachineInfo()
👉 Task: 
Print all details of washing machine.
Use super to call parent constructor.
Use super.showApplianceInfo() inside child method.. */
import java.util.*;
class Appliance{
    String brand ;
    int power ;
    public Appliance(String brand ,int power ){
        
        this.brand= brand;
        
        this.power = power;
       
    }
    void showApplianceInfo(){
        System.out.println(brand);
        System.out.println(power);

    }

}
class WashingMachine extends Appliance{
   public WashingMachine (String brand ,int power){
    super( brand , power);
    int capacity  = 50000;
    System.out.println(capacity);
     super.showApplianceInfo();


   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String brand = sc.nextLine();
       int power = sc.nextInt();
       WashingMachine bb = new WashingMachine(brand, power);
       bb.showApplianceInfo();


   }
}






