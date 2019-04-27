package com.company;

import java.lang.String;

class Car{
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;

    public Car(int cylinders, String name, int wheels, boolean engine) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = wheels;
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }




    public String startEngine(){

      return "Engine started";

    }
    public String accelerate(){
        return "Car accelerated";

    }
    public String brake()
    {
       return "Car brakes";
    }


}



class Megane extends Car{
    public Megane(int cylinders, String name, int wheels, boolean engine) {
        super(2, "Renault Megane", 4, true);
    }

    @Override
    public String startEngine() {
        return "renault megane Started";
    }

    @Override
    public String accelerate() {
        return "renault megane accelerated";
    }

    @Override
    public String brake() {
        return "renault megane hit the breaks";
    }
}
class Ferrari extends Car{
    public Ferrari(int cylinders, String name, int wheels, boolean engine) {
        super(4, "Enzo", 4, true);
    }

    @Override
    public String startEngine() {
       return "Ferrari is able to vroomvroom";
    }

    @Override
    public String accelerate() {
        return "vroom vroom says the Rari";
    }

    @Override
    public String brake() {
        return "BRAKE RARI BRAKE";
    }
}
class Lamborghini extends Car{
    public Lamborghini(int cylinders, String name, int wheels, boolean engine) {
        super(4, "Murcielago", 4, true);
    }

    @Override
    public String startEngine() {
        return "Lambo is ready";
    }

    @Override
    public String accelerate() {
        return "VRUM MADAFAKA VRUM LAMBO";
    }

    @Override
    public String brake() {
        return "NOW STOP,TAKE A LOOK AT THIS BEASTYYELLOWBOI";
    }
}



public class Main {

    public static void main(String[] args) {


        Car car= new Car(8,"Renault megane",4,true);
      System.out.println( car.startEngine());
       System.out.println(car.accelerate());
        System.out.println(car.brake());

        Megane renault=new Megane(8, "RENAULT MEGANE",4,true);
        System.out.println (renault.startEngine());
        System.out.println (renault.accelerate());
        System.out.println (renault.brake());

        Ferrari rari=new Ferrari(4,"Beastboi RARI",4,true);
        System.out.println(rari.startEngine());
        System.out.println(rari.accelerate());
        System.out.println (rari.brake());

        Lamborghini lambo=new Lamborghini(2,"BABIYELLOW LAMBO",4,true);
        System.out.println (lambo.startEngine());
        System.out.println(lambo.accelerate());
        System.out.println(lambo.brake());


    }
}
