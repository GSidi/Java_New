public abstract class EmployeeAbs implements Payable {

    private final String firstname;
    private final String surname;
    private final String SSN;

    public EmployeeAbs (String firstName, String surname, String SSN){
        this.firstname = firstName;
        this.surname = surname;
        this.SSN = SSN;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getSSN() {
        return SSN;
    }

}
