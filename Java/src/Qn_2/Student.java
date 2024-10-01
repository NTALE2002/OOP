package Qn_2;

public class Student extends Person{
    String course_offered;
    public Student(String firstName, String lastName,int yearOfBirth, String course_offered) {
        super(firstName, lastName, yearOfBirth);
        this.course_offered=course_offered;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Course: "+this.course_offered);
    }

    @Override
    public void print(Person person) {
        System.out.println("I am a Student");
    }
}
