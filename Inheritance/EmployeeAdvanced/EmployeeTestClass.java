public class EmployeeTestClass {

    public static void main(String[] args) {

        BasicEmployee basicEmployeeNo1 = new BasicEmployee("George",
                "Sidiropoulos",
                "sdropoulos@gmail.com",
                "gesi123456",
                980.50);

        //System.out.printf("%s", basicEmployeeNo1.toString());

        EmployeeWithCommission employeeWithCommissionNo1 = new EmployeeWithCommission("Dimitris",
                "Sidiropoulos",
                "j_sdropoulos@gmail.com",
                "desi123456",
                850.980,
                12.5,
                500);

        System.out.printf("%s", employeeWithCommissionNo1.toString());
    }
}
