/**
 * Created by Grand Circus Student on 7/20/2017.
 */
public class TestStudent {
    //this class runs at the console
    //so it gets a main

    public static void main (String[]args){
        Student student1 = new Student();
        student1.setFirstName("Allie");
        student1.getLastName("Born");
        student1.setBootcamp("TechHire");
        //
        //
        //
        student1.id(666);
        student1.getGrade(1.0);
        Student student2 = new Student("Abby", "Death","TechHire", 666, 1.0);

        //use the getters to retrieve the info
        System.out.println(student1.getFirstName()+""+student1.getLastName()+"-"
        );
    }
}
