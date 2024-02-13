import java.util.Scanner;
import javax.swing.JOptionPane;
public class FindTheBiggestTest {

    public static void main(String[] args) {
        int numberToCheck;
        int counter;
        int followingNumber;

        int userInput = Integer.parseInt((String) JOptionPane.showInputDialog("Give total number to check biggest from:"));
        numberToCheck = Integer.parseInt((String) JOptionPane.showInputDialog("Give starting number to check:"));
        counter = userInput;
        while(counter>0) {
            followingNumber = Integer.parseInt((String) JOptionPane.showInputDialog("Give number to check:"));
            if (numberToCheck > followingNumber){
                System.out.printf("The biggest from %d and %d is : %d%n",followingNumber,numberToCheck, numberToCheck);
            } else if (numberToCheck < followingNumber) {
                System.out.printf("The biggest from %d and %d is : %d%n",followingNumber,numberToCheck, followingNumber);
                numberToCheck = followingNumber;
            }else{
                System.out.println("They are equals");
            }
            counter -=1;
        }

        System.out.printf("The biggest of them all was : %d%n", numberToCheck);
    }
}
