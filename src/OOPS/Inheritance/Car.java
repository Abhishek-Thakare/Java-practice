package OOPS.Inheritance;
class Vehicle{
    void start(){
        System.out.println("Vehicle Started");
    }
}
public class Car extends Vehicle {
    void drive(){
        System.out.println("Car is driving");
    }
    public static void main(String[] args){
        Car ob=new Car();
        ob.start();
        ob.drive();
    }
}
