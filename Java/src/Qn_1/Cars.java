package Qn_1;

public class Cars extends Vehicle{
    //Single inheretence Demostrated
    int load_capacity;
    public Cars(String make, String model, int year,int load_capacity) {
        super(make, model, year);
        this.load_capacity=load_capacity;
        super.starting();
        super.stop();
    }

    @Override
    void print_details() {
        super.print_details();
        System.out.println(
                this.make +" "+this.model +" has a load capacity of " +load_capacity
        );
    }
}
