import java.util.Scanner;
public class CalculationStuffTest {

    public static void main(String[] args) {
       // int remainingNumbers;
        int factorialResult = 1;
        int factorialResult2 = 1;
        int count;
        int count2;
        double eResult = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Give whose factorial you want:");
        int factorialOf = input.nextInt();
        count = factorialOf;
        while(count>0){
            factorialResult *= count;
            count -=1;
        }
        System.out.printf("-Factorial:%d%n-Result:%d%n",factorialOf,factorialResult);
        System.out.println("Give whose e you want:");
        int eOf = input.nextInt();
        count = 0;
        while(count <= eOf){
            count2 = count;
            factorialResult2 = 1;
            //finding the factorial for denominator
            while(count2>0){
                factorialResult2 *= count2;
                count2 -=1;
            }
            eResult += 1.0/factorialResult2;
            count += 1;
        }
        System.out.printf("Approximation of e: %f.10", eResult);
    }
}
