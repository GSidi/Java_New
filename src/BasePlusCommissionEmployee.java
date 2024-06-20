public class BasePlusCommissionEmployee {

    private final String firstName ;
    private final String lastName ;
    private final String socialSecurityNumber ;

    private double grossSales;
    private double commissionRate;
    private double baseSalary;


    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){

        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be above 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be above 0.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setGrossSales(double grossSales) {

        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be above 0.0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public void setBaseSalary(double baseSalary) {
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Base salary must be above 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double earnings(){

        return  baseSalary = (commissionRate * grossSales);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f","base salary commission employee", firstName, lastName, "social security number",
                socialSecurityNumber, "gross sales", grossSales, "commission rate", commissionRate,
        "base salary", baseSalary);
    }
}
