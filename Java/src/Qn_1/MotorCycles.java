package Qn_1;

public class MotorCycles extends Vehicle {
    //Single inheretence Demostrated
    boolean hasCarrier;

    public MotorCycles(String make, String model, int year, boolean hasCarrier) {
        super(make, model, year);
        this.hasCarrier = hasCarrier;

    }

    @Override
    void print_details() {
        super.print_details();
        String s= this.hasCarrier==false?make +" "+ model + " does not have a carrier " :
                make +" "+ model + "  has a carrier";
        System.out.println(s);
    }
}
