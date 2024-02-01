public class calculator {

    private double number1;
    private double number2;
    private double addition;
    private double multiply;
    private double division;

    public calculator(double number1, double number2){
        this.number1 =  number1;
        this.number2 = number2;
    }
    public void setNumber1(double number1) {
        this.number1 = number1;
    }
    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public void addition(double number1, double number2){
        addition = number1 + number2;
    }
    public double getAddition() {
        return addition;
    }
    public void multiplication(double number1, double number2){
        multiply = number1 * number2;
    }
    public double getMultiply() {
        return multiply;
    }

    public void division(double number1, double number2){
        division = number1 / number2;
    }
    public double getDivision() {
        return division;
    }
}
