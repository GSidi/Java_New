public class EmployeePayments {

    private String name;
    private String surname;
    private double income;
    private double bonus;
    private double raise;
    private double incomeWithBonus;
    private double yearlyIncome;
    private double incomeWithRaise;

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
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getRaise() {
        return raise;
    }
    public void setRaise(double raise) {
        this.raise = raise;
    }
    public double yearlyIncome(double income){
        yearlyIncome = income*12;
        return yearlyIncome;
    }
    public double addBonus(double income, double bonus){
        incomeWithBonus = income + (income * bonus / 100);
        return incomeWithBonus;
    }
    public double giveRaise(double income, double raise){
        incomeWithRaise = income + raise;
        return incomeWithRaise;
    }
}
