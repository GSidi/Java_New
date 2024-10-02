public class StudentOfSchool extends Person{

    private String studentUsername;
    private String studentPassword;
    public StudentOfSchool(String firstname, String surname, int age, String studentUsername, String studentPassword){
        super(firstname, surname, age);

        try{
            this.studentUsername = studentUsername;
        }catch (IllegalArgumentException e){
            System.out.printf("studentUsername needs to be a string :%s",e);
        }

        try{
            this.studentPassword = studentPassword;
        }catch (IllegalArgumentException e){
            System.out.printf("studentPassword needs to be a string :%s",e);
        }
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public String getStudentUsername() {
        return studentUsername;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }

    @Override
    public String toString() {
        return String.format("%s%n-Student Info:%n--Student Username:%s%n--Student Password:%s%n",
                super.toString(),getStudentUsername(),getStudentPassword());
    }

}
