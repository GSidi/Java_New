public class Employee {

    private String firstName;
    private String surname;
    private int age;
    private String email;
    private String countryOfOrigin;
    private String livingLocation;

    private double baseSalary;

    public Employee (String firstName, String surname, int age, String email, String countryOfOrigin, String livingLocation, double baseSalary){

        if (firstName.isEmpty()){
            throw new IllegalArgumentException("First name is required");
        }
        if (surname.isEmpty()){
            throw new IllegalArgumentException("Surname name is required");
        }
        if (email.isEmpty()){
            throw new IllegalArgumentException("Email is required");
        }
        if (countryOfOrigin.isEmpty()){
            throw new IllegalArgumentException("Country of origin is required");
        }
        if (livingLocation.isEmpty()){
            throw new IllegalArgumentException("Current living location is required");
        }
        if (age == 0){
            throw new IllegalArgumentException("Age is required");
        }
        if (baseSalary == 0){
            throw new IllegalArgumentException("Base Salary is required");
        }

        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
        this.email = email;
        this.countryOfOrigin = countryOfOrigin;
        this.livingLocation = livingLocation;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getAge() {
        return age;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLivingLocation() {
        return livingLocation;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLivingLocation(String livingLocation) {
        this.livingLocation = livingLocation;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%s:%n-%s : %s%n-%s : %s%n-%s : %s%n-%s : %d%n-%s : %s%n-%s : %s%n-%s : %.2f",
                "Basic Info",
                "First Name", getFirstName(),
                "Surname", getSurname(),
                "Email", getEmail(),
                "Age", getAge(),
                "Country of Origin", getCountryOfOrigin(),
                "Current Living Location", getLivingLocation(),
                "Base Salary", getBaseSalary());
    }
}
