package Qn_1;

public class Main {
    public static void main(String[] args) {


        Cars car1=new Cars("Toyota","Bentely",2012,4);
        car1.print_details();

        System.out.println("\n");
        Bugatti bugatti=new Bugatti("Germany","Bugatti",2021,2);
        System.out.println("\n");

        MotorCycles motorCycles1=new MotorCycles("Ferrari","maced",2017,false);
        motorCycles1.print_details();
        System.out.println("\n");

        Ducati bike1=new Ducati("Toyota","Ducatti",2015,true);
        bike1.print_details();


    }
}
