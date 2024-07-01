public class EmployeeWithCommission extends BasicEmployee{

    private double commissionRate;

    private int grossSales;

    public EmployeeWithCommission(String firstName, String surname, String email, String socialSecurityNumber, double baseSalary,
                                  double commissionRate, int grossSales){
        super(firstName, surname, email, socialSecurityNumber, baseSalary);

        if(commissionRate == 0.0)
            throw new IllegalArgumentException("Commission rate must not be 0.0");

        if(grossSales == 0.0)
            throw new IllegalArgumentException("Gross Sales must not be 0.0");

        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public double earnings(){
        return getCommissionRate() * getGrossSales()/2;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %d%n%s : %.2f%n%s : %.2f",
                super.toString(),
                "Gross Sales", getGrossSales(),
                "Commission Rate", getCommissionRate(),
                "Earnings", earnings());
    }
}
