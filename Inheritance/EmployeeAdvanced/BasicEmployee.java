public class BasicEmployee {

    private String firstName;
    private String surname;
    private String email;
    private String socialSecurityNumber;

    private double baseSalary;

    public BasicEmployee (String firstName, String surname, String email, String socialSecurityNumber, double baseSalary){

        if (firstName.isEmpty())
            throw new IllegalArgumentException("First name can not be an empty string");

        if (surname.isEmpty())
            throw new IllegalArgumentException("Surname can not be an empty string");

        if (email.isEmpty())
            throw new IllegalArgumentException("Email can not be an empty string");

        if (socialSecurityNumber.isEmpty())
            throw new IllegalArgumentException("Social security number can not be an empty string");

        if (baseSalary == 0)
            throw new IllegalArgumentException("Base salary can not be empty");

        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
        this.baseSalary = baseSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double yearlyEarnings(){
        return baseSalary * 12;
    }

    @Override
    public String toString() {
        return String.format("%s : %s%n%s : %s%n%s : %s%n%s : %s%n%s : %.2f%n%s : %.2f",
                "Employee First Name", getFirstName(),
                "Employee Surname", getSurname(),
                "Employee Email", getEmail(),
                "Employee SSN", getSocialSecurityNumber(),
                "Employee Base Salary", getBaseSalary(),
                "Employee Basic Yearly Earnings", yearlyEarnings());
    }
}
