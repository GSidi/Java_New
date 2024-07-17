public class BasePlusCommissionEmployee_poly extends CommissionEmployee_poly{

    private double baseSalary;

    public BasePlusCommissionEmployee_poly(String firstName, String surname, String socialSecurityNumber,
                                           double grossSales, double commissionRate, double baseSalary){
        super(firstName, surname, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double monthlyEarnings() {
        return getBaseSalary() + super.monthlyEarnings();
    }

    @Override
    public String toString() {
        return String.format("%s  %s%n%s : %.2f",
                "Base Salaried", super.toString(),
                "Base Salary", getBaseSalary());
    }
}
