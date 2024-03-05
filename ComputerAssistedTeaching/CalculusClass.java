public class CalculusClass {

    int firstNumber;
    int secondNumber;
    String methodToApply;
    double result;

    public CalculusClass(int firstNumber , int secondNumber, String methodToApply){
        this.firstNumber =  firstNumber;
        this.secondNumber = secondNumber;
        this.methodToApply = methodToApply;
    }
    public int getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    public int getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    public String getMethodToApply() {
        return methodToApply;
    }
    public void setMethodToApply(String methodToApply) {
        this.methodToApply = methodToApply;
    }

    public double calculusResult(int firstNumber , int secondNumber, String methodToApply){

        switch (methodToApply){
            case "1":
                //addition
                result = (double) firstNumber + secondNumber;
                break;
            case "2":
                //subtraction
                result = (double) firstNumber - secondNumber;
                break;
            case "3":
                //multiplication
                result = (double) firstNumber * secondNumber;
                break;
            case "4":
                //division
                result = (double) firstNumber / secondNumber;
                break;
        }

        return result;
    }
}
