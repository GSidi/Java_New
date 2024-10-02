import java.nio.channels.ScatteringByteChannel;

public abstract class Person implements  BasicPersonInfo{

    private final String firstname;
    private final String surname;
    private final int age;

    public Person(String firstname, String surname, int age){

        if (firstname.equals("")){
            throw new IllegalArgumentException();
        }else {
            this.firstname = firstname;
        }

        if (surname.equals("")){
            throw new IllegalArgumentException();
        }else{
            this.surname = surname;
        }

        if (age == 0){
            throw new IllegalArgumentException();
        }else{
            this.age = age;
        }

    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getFullname() {
        return getFirstname()+" "+getSurname();
    }

    @Override
    public String toString() {
        return String.format("Person Info:%n-Basic Info:%n--Full Name:%s%n--Age:%d",
                getFullname(),getAge());
    }
}
