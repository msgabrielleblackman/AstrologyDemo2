import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.print.DocFlavor;

/**
 * Created by Grand Circus Student on 7/20/2017.
 */
public class Student {
    //object; a bundle of data and behaviors

    //data: instance variables (member variables, fields)
    //these exist outside of the methods
    //the entire lifetime of the class


    //as general rule, instance variables are private
  private String firstName;
  private String lastName;
  private String bootcamp;
  private int id;
  private double grade;

  //behaviors/methods
    //as general rule, public

    //constructor: public method that creates the instance
    //whats called when the new keyword is used with the class
    //1. visibility modifier: usually public
    //2.never static
    //3.NO RETURN TYPE
    //4. name =name of the class (capitalize the same)
    //5. arguments vary
    //might take 1 arguments for each instance variable
    //might take no arguments and set everything
    //to default values

    //no arguments
    // just sets everything to default values
    public Student(){
        firstName = "";
        lastName = "";
        bootcamp = "";
        id = 42;
        grade = 1.0;
    }
    //all arguments constructor
    public Student(String fn, String ln, String bc, int i, double g) {
        firstName = fn;
        lastName = ln;
        bootcamp = bc;
        id = i;
        grade = g;
    }

    //getters (accessors) provide public view access
    //private instance variables
    //1.visibility modifier: public
    //2.
    //3.
    //4. name is usually get
    //5. usuually no arguments
    //method body
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getBootcamp() {
        return bootcamp;
    }
    public int getId() {
        return id;
    }
    public double getGrade(){
        return grade;
    }
    //setters (mutators) provide public write access to
    //private instance variables
    ////getters (accesors) provide public view access
    //private instance variables
    //1.visibility modifier: public
    //2.
    //3.
    //4. name is usually get
    //5. usuually no arguments
    //method body
    //
    //
    //

    public void setFirstName(String fn) {
        //I need to capture the value from the argument
        //which is going to scope out soon
        //
        //
        firstName = fn;
    }
    //the other way to name the argument
    public void setLastName(String lastName){
        //this keyword refers to the instance
        //is the local variable/argument
        //this is called shadowing

        lastName = this.lastName;

    }
    public void setBootcamp(String bootcamp) {
        this.bootcamp = bootcamp;
    }
    //there is intentionally no setID
    //ID is locked in after the instance is created

    public void setGrade (double grade){
        this.grade = grade;
    }

    //helper methods: usually
    //

}

