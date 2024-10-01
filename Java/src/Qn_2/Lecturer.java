package Qn_2;

public class Lecturer extends Person{
        String expertise;

    public Lecturer(String firstName, String lastName, int yearOfBirth,String expertise) {
        super(firstName, lastName,yearOfBirth);
        super.calcAge();
        this.expertise=expertise;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Expertise: "+this.expertise);
    }

    @Override
    public void print(Person person) {
        System.out.println("I am a Lecturer");
    }
}
