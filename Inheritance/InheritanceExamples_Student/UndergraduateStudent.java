public class UndergraduateStudent extends StudentOfSchool {

    private final int numberOfYearsToGraduate; //Total number of years needed to graduate on average.
    private final String universityName;
    private final String universityLocation;
    private final String field;

    private  final String studentStatus;//Active or Inactive.
    private final int numberOfCourses; //Total courses you have to complete for the graduation to occur.

    public UndergraduateStudent(String firstName, String surname, int age, String dateOfBirth, String email,
                                int numberOfYearsToGraduate, int numberOfCourses, String universityName, String universityLocation , String field, String studentStatus){

        super(firstName, surname, age, dateOfBirth, email);

        if (numberOfYearsToGraduate == 0){
            throw new IllegalArgumentException("Maximum years until graduation is required.");
        }
        if (universityName.equals("")){
            throw new IllegalArgumentException("University name is required.");
        }
        if (universityLocation.equals("")){
            throw new IllegalArgumentException("University location is required.");
        }
        if (field.equals("")){
            throw new IllegalArgumentException("University field is required.");
        }
        if (numberOfCourses == 0){
            throw new IllegalArgumentException("Total number of courses is required.");
        }
        if (studentStatus.equals("")){
            throw new IllegalArgumentException("Student status is required.");
        }

        this.numberOfYearsToGraduate = numberOfYearsToGraduate;
        this.universityName = universityName;
        this.universityLocation = universityLocation;
        this.field = field;
        this.numberOfCourses = numberOfCourses;
        this.studentStatus = studentStatus;

    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public int getNumberOfYearsToGraduate() {
        return numberOfYearsToGraduate;
    }

    public String getField() {
        return field;
    }

    public String getUniversityLocation() {
        return universityLocation;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %s%n%s : %s%n%s : %s%n%s : %s%n%s : %d%n%s : %d",
                super.toString(),
                "Student Status", getStudentStatus(),
                "University Name", getUniversityName(),
                "University Location", getUniversityLocation(),
                "University field", getField(),
                "Total number of years needed", getNumberOfYearsToGraduate(),
                "Total number of courses needed", getNumberOfCourses());
    }
}
