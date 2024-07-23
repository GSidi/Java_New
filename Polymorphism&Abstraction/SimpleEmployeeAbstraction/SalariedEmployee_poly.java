public class SalariedEmployee_poly  extends  EmployeeAbstract{

    private double weeklySalary;
    public SalariedEmployee_poly(String firstName, String surname, String socialSecurityNumber, double weeklySalary){
        super(firstName, surname, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double monthlyEarnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s%n%s: $%.2f",super.toString(), "Weekly Salary", getWeeklySalary());
    }
}
