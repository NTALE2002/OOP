package Qn_2;

import java.time.Year;

public class Person {
    String firstName;
    String lastName;
    int yearOfBirth;
    int age;

    public Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth=yearOfBirth;
        age=calcAge();
    }
    public int calcAge(){
        return Year.now().getValue()-this.yearOfBirth;
    }
    public void print(){
        System.out.println("firstName: "+this.firstName+"\n"+
                        "LastName: "+this.lastName+"\n"+
                        "Age: "+this.age);

    }

    public void print(Person person){
        System.out.println("...God created me..");
    }

}
