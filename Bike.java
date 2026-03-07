/*Vehicle Speed System

You are creating a program to display vehicle speed.

Vehicle class → method showSpeed()

Car class extends Vehicle

Bike class extends Vehicle

Each subclass should show a different speed value. */ 

class Vechile{
   void  showSpeed(){
        System.out.println("speed of vechile 100km");
    }
}
class Car extends Vechile{
    void koi(){
        System.out.println("speed of car 200km");
    }
}
class Bike extends Vechile{
    void where(){
        System.out.println("speed of bike 50km");
    }
    public static void main(String args[]){
        Bike bb = new Bike();
        Car cc = new Car();
        bb.showSpeed();
        cc.koi();
        bb.where();
    }
}