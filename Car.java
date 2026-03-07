import java.util.*;
class Car 
{
   String carName;
     int price;
    int numberOfDays;
public Car(String carName, int numberOfDays)
{
    this.carName=carName;
    
    this.numberOfDays=numberOfDays;
}
   void calculateBill(){
    if(carName.equals("thar")&&numberOfDays<7){
        int price = 1000*numberOfDays;
        System.out.println("price of car for one day is:"+price);
        

    }
    if (numberOfDays>7){
         int price = 1000*numberOfDays;
            int discount= ((price *10)/100);
            int finalprice= price-discount;
            System.out.println("price of car for "+numberOfDays+"days is:"+finalprice);
        }
    else{
        System.out.println("car has been booked by another person");
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the car name ");
    String carName = sc.nextLine();
    System.out.println("enter the no.of days ");
    int numberOfDays = sc.nextInt();
    Car a = new Car(carName,  numberOfDays);
    
    a.calculateBill();
    System.out.println();
    

}

}

