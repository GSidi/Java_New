public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("George", "Sidiropoulos",
                "1111", 10000, 0.6, 1200);

        System.out.println("Employee information obtained by methods:");
        System.out.printf("%n%s %s%n","First Name is", employee.getFirstName());
        System.out.printf("%n%s %s%n","Last Name is", employee.getLastName());
        System.out.printf("%n%s %s%n","SSN is", employee.getSocialSecurityNumber());
        System.out.printf("%n%s %s%n","Gross sales are", employee.getGrossSales());
        System.out.printf("%n%s %s%n","Commission rate is", employee.getCommissionRate());
        System.out.printf("%n%s %s%n","Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(5000);

        System.out.printf("%n%s:%n%n%s%n","Updated employee information obtained by toString", employee.toString());
    }
}
