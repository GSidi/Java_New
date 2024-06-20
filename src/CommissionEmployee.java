public class CommissionEmployee extends Object{

    private final String firstName ;
    private final String lastName ;
    private final String socialSecurityNumber ;

    private double grossSales;
    private double commissionRate;

    public  CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {

        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be above 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

}
