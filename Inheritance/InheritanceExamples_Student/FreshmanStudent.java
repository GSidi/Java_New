public class FreshmanStudent extends UndergraduateStudent{

    private final String studentTitle; //Freshman
    private  int numberOfCoursesThisYear;
    private  int  numberOfYearStudying; //Number of years the student remained a Freshman
    private  String activityOrSportChosen;


    public FreshmanStudent(String firstName, String surname, int age, String dateOfBirth, String email,
                           int numberOfYearsToGraduate, int numberOfCourses, String universityName, String universityLocation , String field, String studentStatus,
                           String studentTitle, String activityOrSportChosen, int numberOfYearStudying, int numberOfCoursesThisYear){

        super(firstName, surname, age, dateOfBirth, email,
                numberOfYearsToGraduate, numberOfCourses, universityName, universityLocation , field, studentStatus);

        if (!studentTitle.equals("Freshman")){
            throw new IllegalArgumentException("Student title can nto be other than freshman.");
        }
        if (numberOfCoursesThisYear == 0){
            throw new IllegalArgumentException("Total number of courses is required.");
        }
        if (numberOfYearStudying == 0){
            throw new IllegalArgumentException("Number of years at this level is required.");
        }
        if (activityOrSportChosen.equals("")){
            throw new IllegalArgumentException("Student at freshman year has to choose an activity or a sport.");
        }

        this.studentTitle =studentTitle;
        this.activityOrSportChosen = activityOrSportChosen;
        this.numberOfYearStudying = numberOfYearStudying;
        this.numberOfCoursesThisYear = numberOfCoursesThisYear;
    }

    public int getNumberOfCoursesThisYear() {
        return numberOfCoursesThisYear;
    }

    public int getNumberOfYearStudying() {
        return numberOfYearStudying;
    }

    public String getActivityOrSportChosen() {
        return activityOrSportChosen;
    }

    public String getStudentTitle() {
        return studentTitle;
    }

    public void setActivityOrSportChosen(String activityOrSportChosen) {
        this.activityOrSportChosen = activityOrSportChosen;
    }

    public void setNumberOfCoursesThisYear(int numberOfCoursesThisYear) {
        this.numberOfCoursesThisYear = numberOfCoursesThisYear;
    }

    public void setNumberOfYearStudying(int numberOfYearStudying) {
        this.numberOfYearStudying = numberOfYearStudying;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %s%n%s : %s%n%s : %d%n%s : %d",
                super.toString(),
                "Student Title", getStudentTitle(),
                "Activity/Sport Chosen", getActivityOrSportChosen(),
                "Years at this level", getNumberOfYearStudying(),
                "Number of courses this year", getNumberOfCoursesThisYear());
    }
}
 