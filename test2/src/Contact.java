public abstract class Contact {

    private String firstName;
    protected String lastName;
    private int phoneNumber;
    private String email;

    public static int count = 0;

    public Contact() {

        firstName = "";
        lastName = "";
        phoneNumber = getPhoneNumber(0);
        email = "";
    }

    protected abstract int getPhoneNumber(int i);

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.getEmail() + getPhoneNumber() + ": "
                + lastName + ", " + firstName
                + "(" + phoneNumber + ") ";
    }
}



