import java.util.ArrayList;

/**
 * Created by Grand Circus Student on 7/31/2017.
 */
public class ContactManager {
    protected String firstName;
    protected String lastName;



    public ContactManager(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public ContactManager() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}


        public static void main(String[] args) {

            //syntax for ArrayList is different
            ArrayList<ContactManager>contactManagerArrayList = new ArrayList<ContactManager>();
           contactManagerArrayList.add(new ContactManager("Jim", "Jones"));
            contactManagerArrayList.add(new ContactManager("Gabrielle", "Union"));
            contactManagerArrayList.add(new ContactManager("John", "Q"));
}
