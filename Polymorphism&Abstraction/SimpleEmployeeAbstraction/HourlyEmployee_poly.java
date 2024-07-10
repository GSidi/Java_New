public class HourlyEmployee_poly  extends  EmployeeAbstract{

    private double wage;
    private double hours;
    public HourlyEmployee_poly(String firstName, String surname, String socialSecurityNumber, double wage, double hours){
        super(firstName, surname, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double monthlyEarnings() {
        return 40 * getWage() + (getHours() - 40) *getWage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%n%s: $%.2f;  %s: %.2f",
                super.toString(),
                "Hourly Wage", getWage(),
                "Hours Worked",getHours());
    }
}
