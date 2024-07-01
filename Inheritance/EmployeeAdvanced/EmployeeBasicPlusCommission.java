public class EmployeeBasicPlusCommission extends  EmployeeWithCommission{

    public EmployeeBasicPlusCommission (String firstName, String surname, String email, String socialSecurityNumber, double baseSalary,
                                        double commissionRate, int grossSales){

        super(firstName, surname, email, socialSecurityNumber, baseSalary, commissionRate, grossSales);
    }

    public double earningsPlusBase(){
        return super.earnings() + super.getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %s",
                super.toString(),
                "Earnings Plus Basic Salary", earningsPlusBase());
    }
}
