public class SalariedEmployee extends BasicEmployee{

    private double salaryPerMonth;
    public SalariedEmployee (String firstName, String surname, String email, String socialSecurityNumber, double baseSalary,
                             double salaryPerMonth){

        super(firstName, surname, email, socialSecurityNumber, baseSalary);

        if (salaryPerMonth == 0.0)
            throw new IllegalArgumentException("Salary per month can not be 0.0");

        this.salaryPerMonth = salaryPerMonth;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double earnings(){
        return getSalaryPerMonth() * 12;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %.2f",
                super.toString(),
                "Salary Per Month of Employee", getSalaryPerMonth());
    }
}
