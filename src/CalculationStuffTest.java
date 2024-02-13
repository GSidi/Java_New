import java.util.Scanner;
public class CalculationStuffTest {

    public static void main(String[] args) {
       // int remainingNumbers;
        int factorialResult = 1;
        int count;

        Scanner input = new Scanner(System.in);
        System.out.println("Give whose factorial you want:");
        int factorialOf = input.nextInt();
        count = factorialOf;
        while(count>0){
            factorialResult *= count;
            count -=1;
        }
        System.out.printf("-Factorial:%d%n-Result:%d%n",factorialOf,factorialResult);
    }
}
