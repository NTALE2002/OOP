package Qn_1;

public class Bugatti extends Cars{
    //Multi Level inheretence
    public Bugatti(String make, String model, int year, int load_capacity) {
        super(make, model, year, load_capacity);
        super.print_details();
    }


}
