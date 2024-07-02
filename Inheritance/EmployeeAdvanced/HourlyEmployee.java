public class HourlyEmployee extends BasicEmployee{

    private double salaryPerHour;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String surname, String email, String socialSecurityNumber, double baseSalary,
                          double salaryPerHour , int hoursWorked){

        super(firstName, surname, email, socialSecurityNumber, baseSalary);

        if (salaryPerHour == 0.0)
            throw new IllegalArgumentException("Salary per hour can not be 0.0");

        if (hoursWorked == 0)
            throw new IllegalArgumentException("Hours worked can not be 0");

        this.salaryPerHour = salaryPerHour;
        this.hoursWorked = hoursWorked;

    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public double earnings(){
        return getSalaryPerHour() * getHoursWorked();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s : %.2f",
                super.toString(),
                "Earnings of Hourly Employee", earnings());
    }
}
