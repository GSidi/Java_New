public class Employees_Test {

    public static void main(String[] args) {

        Employee testEmployee = new Employee("George",
                "Sidiropoulos",
                26,
                "sdropoulos@gmail.com",
                "Greece",
                "Kavala",
                1113.5);

        //System.out.println(testEmployee.toString());

        Manager newManager = new Manager(testEmployee.getFirstName(),
                testEmployee.getSurname(),
                testEmployee.getAge(),
                testEmployee.getEmail(),
                testEmployee.getCountryOfOrigin(),
                testEmployee.getLivingLocation(),
                testEmployee.getBaseSalary(),
                500,
                "IT informatics",
                "Manger of IT",
                "Team 99");

        System.out.println(newManager.toString());

        System.out.printf("%s : %.2f",
                "Total earnings per month", newManager.earnings());
    }
}
