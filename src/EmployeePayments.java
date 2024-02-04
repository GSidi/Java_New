public class EmployeePayments {

    private String name;
    private String surname;
    private double income;
    private double bonus;
    private double raise;

    public EmployeePayments (String name, String surname, double income, double bonus, double raise){
        this.name = name;
        this.surname = surname;
        this.income = income;
        this.bonus = bonus;
        this.raise = raise;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getIncome() {
        return income;
    }
    public double getBonus() {
        return bonus;
    }
    public double getRaise() {
        return raise;
    }

    public double yearlyIncome(double income){
        double yearlyIncome = income*12;
        return yearlyIncome;
    }

}
