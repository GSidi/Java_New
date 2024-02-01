import java.util.Scanner;
public class CalculatorTest {

    public static void main(String[] args) {

        calculator calculator = new calculator(100,100);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number (double) :");
        double userInput1 = input.nextDouble();
        System.out.println("Enter second number (double) :");
        double userInput2 = input.nextDouble();

        calculator.addition(userInput1, userInput2);
        System.out.printf("The sum of %.2f and %.2f is : %.2f%n", userInput1, userInput2, calculator.getAddition());

        calculator.multiplication(userInput1, userInput2);
        System.out.printf("The multiplication of %.2f and %.2f is : %.2f%n", userInput1, userInput2, calculator.getMultiply());

        calculator.division(userInput1, userInput2);
        System.out.printf("The division of %.2f and %.2f is : %.2f", userInput1, userInput2, calculator.getDivision());
    }
}
