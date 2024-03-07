import java.util.Scanner;
import java.security.SecureRandom;
public class LearnMath {

    public static void main(String[] args) {

        boolean startLearning = true;
        int firstRandomNumber;
        int secondRandomNumber;
        double correctResult;
        int answer;
        String mathOperation;
        String breakChoice;

        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        CalculusClass mathOperationObject = new CalculusClass(0,0,"");

        System.out.println("Do you want to learn math operations?(Y/N)");
        String choice = input.nextLine();
        switch (choice){
            case "Y":
                System.out.printf("What do you want to learn?%n-For addition type :1%n-For subtraction type :2%n-For multiplication type :3%n-For division type :4%n-Choice Field:");
                mathOperationObject.setMethodToApply(input.nextLine());
                mathOperation = mathOperationObject.getMethodToApply();
                while(startLearning){
                    if (mathOperation.equals("1")){
                            mathOperationObject.setFirstNumber(rand.nextInt(100));
                            mathOperationObject.setSecondNumber(rand.nextInt(100));
                            firstRandomNumber = mathOperationObject.getFirstNumber();
                            secondRandomNumber = mathOperationObject.getSecondNumber();
                            correctResult = mathOperationObject.calculusResult(firstRandomNumber, secondRandomNumber, mathOperation);
                            System.out.printf("How much does %d + %d equals?%n-Answer:",firstRandomNumber ,secondRandomNumber);
                            answer = input.nextInt();
                            if ((int) correctResult == answer){
                                System.out.println("You are correct");
                            }else {
                                System.out.println("You are wrong");
                            }
                    }else if (mathOperation.equals("2")){
                        mathOperationObject.setFirstNumber(rand.nextInt(100));
                        mathOperationObject.setSecondNumber(rand.nextInt(100));
                        firstRandomNumber = mathOperationObject.getFirstNumber();
                        secondRandomNumber = mathOperationObject.getSecondNumber();
                        correctResult = mathOperationObject.calculusResult(firstRandomNumber, secondRandomNumber, mathOperation);
                        System.out.printf("How much does %d - %d equals?%n-Answer:",firstRandomNumber ,secondRandomNumber);
                        answer = input.nextInt();
                        if ((int) correctResult == answer){
                            System.out.println("You are correct");
                        }else {
                            System.out.println("You are wrong");
                        }
                    }
                    input.nextLine();
                    System.out.println("Do you want to continue?(Y/N)");
                    breakChoice = input.nextLine();
                    if (breakChoice.equals("N")){
                        startLearning = false;
                        System.out.println("See you next time!!!");
                        break;
                    }else {
                        continue;
                    }
                }
            case "N":
                System.out.println("See you next time");
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
    }

}
