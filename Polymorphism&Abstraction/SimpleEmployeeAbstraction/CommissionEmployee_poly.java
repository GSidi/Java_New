public class CommissionEmployee_poly extends EmployeeAbstract{

    private double grossSales , commissionRate;

    public CommissionEmployee_poly(String firstName, String surname, String socialSecurityNumber, double grossSales, double commissionRate){

        super(firstName, surname, socialSecurityNumber);

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double monthlyEarnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %.2f%n%s: %.2f",
                "Commission Employee",super.toString(),
                "Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate());
    }
}
