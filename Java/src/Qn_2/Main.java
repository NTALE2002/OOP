package Qn_2;
public class Main {
    public static void poly(Person person){
        person.print(person);
    }
    public static void main(String[] args) {
       Person lecturer1=new Lecturer("Kato",
               "Kenneth",1984,"Programming");
       Person student =new Student("Ntale","Samad",
               2002,"BIT");
       student.print();
        System.out.println("\n");
       lecturer1.print();

        System.out.println("\n");
        System.out.println("//......Demostraing RunTime polymophism......");
        poly(lecturer1);
        poly(student);

    }
}
