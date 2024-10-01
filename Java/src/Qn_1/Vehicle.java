package Qn_1;

public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void stop(){
        System.out.println(make + " "+model + " is Stoping");
    }
    void starting(){
        System.out.println(make + " "+ model +" is starting");
    }
    void print_details(){
        System.out.println("MAKE: "+make +"\n"+
                           "MODEL: "+model +"\n"+
                            "YEAR: "+year
                );
    }
}
