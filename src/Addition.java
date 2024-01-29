import java.util.Scanner; //Scanner class

public class Addition {

    public static void main(String[] args){
        //variables
        int number1;
        int number2;
        int sum;

        //creation of a scanner for input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);

    }
}
