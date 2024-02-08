public class IncomeCalculator {

    private String name;
    private String surname;
    private double income;
    private double aboveLimitHours;
    private double pricePerHour;
    private double hoursWorked;

    public  IncomeCalculator(String name, String surname, double pricePerHour, double hoursWorked){
        this.name = name;
        this.surname= surname;
        this.pricePerHour=pricePerHour;
        this.hoursWorked=hoursWorked;
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
    public double getPricePerHour() {
        return pricePerHour;
    }
    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateIncome(double pricePerHour, double hoursWorked){
        if(hoursWorked <= 40){
            income = (pricePerHour * hoursWorked )* 4;
        } else if (hoursWorked >40) {
            aboveLimitHours = hoursWorked - 40;
            income = (aboveLimitHours * (pricePerHour * 1.5) + (hoursWorked - aboveLimitHours) * pricePerHour)*4;
        }
        return income;
    }
}
