package Qn_1;

public class Ducati extends MotorCycles{
//multi Level inheretence

    public Ducati(String make, String model, int year, boolean hasCarrier) {
        super(make, model, year, hasCarrier);

    }
    @Override
    void print_details() {
        super.print_details();
    }
}
