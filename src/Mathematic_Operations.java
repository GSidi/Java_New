import java.util.Scanner;
public class Mathematic_Operations {

    public static void main(String[] args) {
        int number1;
        int number2;
        int sumAddition;
        int sumMultiplication;
        int sumDivision;
        int sumDeletion;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        number1 = input.nextInt();

        System.out.println("Enter a second integer: ");
        number2 = input.nextInt();

        sumAddition = number1 + number2;
        sumDeletion = number1 - number2;
        sumMultiplication = number1 * number2;
        sumDivision = number1 / number2;

        System.out.printf("Sum of these 2 integers is (add): %d%n", sumAddition);
        System.out.printf("Sum of these 2 integers is (delete): %d%n", sumDeletion);
        System.out.printf("Sum of these 2 integers is (multiply): %d%n", sumMultiplication);
        System.out.printf("Sum of these 2 integers is (divide): %d%n", sumDivision);



    }
}
