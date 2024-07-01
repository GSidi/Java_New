public class EmployeeTestClass {

    public static void main(String[] args) {

        BasicEmployee basicEmployeeNo1 = new BasicEmployee("George",
                "Sidiropoulos",
                "sdropoulos@gmail.com",
                "gesi123456",
                980.50);

        System.out.printf("%s", basicEmployeeNo1.toString());
    }
}
