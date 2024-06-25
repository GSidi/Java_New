public class Student {

    private final String firstName;
    private final String surname;
    private final int age;
    private final String dateOfBirth;
    private final String email;


    public Student(String firstName, String surname, int age, String dateOfBirth, String email){
        if (firstName.equals("")){
            throw new IllegalArgumentException("First name is required.");
        }
        if (surname.equals("")){
            throw new IllegalArgumentException("Surname is required.");
        }
        if (dateOfBirth.equals("")){
            throw new IllegalArgumentException("Date of Birth is required.");
        }
        if (email.equals("")){
            throw new IllegalArgumentException("Email is required.");
        }
        if (age == 0) {
            throw new IllegalArgumentException("Age is required.");
        }

        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %s%n%s : %s%n%s : %s%n%s : %d%n%s : %s",
                "Student Information",
                "Student's First Name",getFirstName(),
                "Student's Surname",getSurname(),
                "Student's Date of Birth", getDateOfBirth(),
                "Student's Age", getAge(),
                "Student's Email", getEmail());
    }
}
