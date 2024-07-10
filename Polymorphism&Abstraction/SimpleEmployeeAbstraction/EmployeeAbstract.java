public  abstract  class EmployeeAbstract {

    private final String firstName;
    private final String surname;
    private final String socialSecurityNumber;
    public  EmployeeAbstract(String firstName, String surname, String socialSecurityNumber){

        this.firstName = firstName;
        this.surname = surname;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return String.format("%s  %s%nSocial Security Number: %s",getFirstName(),getSurname(),getSocialSecurityNumber());
    }
    public abstract double monthlyEarnings();
}
