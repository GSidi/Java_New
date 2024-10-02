public class Student extends Person{

    private String studentUsername;
    private String studentPassword;
    public Student(String firstname, String surname, int age, String studentUsername, String studentPassword){
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
}
