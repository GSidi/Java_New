import java.util.Scanner;
import java.security.SecureRandom;
public class LearnMath {

    public static void main(String[] args) {

        boolean startLearning = true;
        int firstRandomNumber;
        int secondRandomNumber;
        double correctResult;
        int answer;
        int evaluationPoint = 0;
        int correctAnswersCounter = 0;
//        int wrongAnswersCounter = 0;
        float barResult = 0;
        String mathOperation;
        String breakChoice;

        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        CalculusClass mathOperationObject = new CalculusClass(0,0,"");
        Responses responsesObject =  new Responses(true);

        System.out.println("Do you want to learn math operations?(Y/N)");
        String choice = input.nextLine();
        switch (choice){
            case "Y":
                System.out.printf("What do you want to learn?%n-For addition type :1%n-For subtraction type :2%n-For multiplication type :3%n-For division type :4%n-Choice Field:");
                mathOperationObject.setMethodToApply(input.nextLine());
                mathOperation = mathOperationObject.getMethodToApply();
                while(startLearning){
                    mathOperationObject.setFirstNumber(rand.nextInt(10));
                    mathOperationObject.setSecondNumber(rand.nextInt(10));
                    firstRandomNumber = mathOperationObject.getFirstNumber();
                    secondRandomNumber = mathOperationObject.getSecondNumber();
                    correctResult = mathOperationObject.calculusResult(firstRandomNumber, secondRandomNumber, mathOperation);
                    if (mathOperation.equals("1")){
                            System.out.printf("Question %d/10:How much does %d + %d equals?%n-Answer:",evaluationPoint, firstRandomNumber ,secondRandomNumber);
                            answer = input.nextInt();
                            if ((int) correctResult == answer){
                                System.out.printf("%s%n",responsesObject.positiveResponses(true, rand.nextInt(4)));
                                correctAnswersCounter++;
                            }else {
                                System.out.printf("%s%n",responsesObject.negativeResponses(false, rand.nextInt(4)));
                            }
                    }else if (mathOperation.equals("2")){
                        System.out.printf("Question %d/10:How much does %d - %d equals?%n-Answer:",evaluationPoint, firstRandomNumber ,secondRandomNumber);
                        answer = input.nextInt();
                        if ((int) correctResult == answer){
                            System.out.printf("%s%n",responsesObject.positiveResponses(true, rand.nextInt(4)));
                            correctAnswersCounter++;
                        }else {
                            System.out.printf("%s%n",responsesObject.negativeResponses(false, rand.nextInt(4)));
                        }
                    }else if (mathOperation.equals("3")){
                        System.out.printf("Question %d/10:How much does %d * %d equals?%n-Answer:",evaluationPoint, firstRandomNumber ,secondRandomNumber);
                        answer = input.nextInt();
                        if ((int) correctResult == answer){
                            System.out.printf("%s%n",responsesObject.positiveResponses(true, rand.nextInt(4)));
                            correctAnswersCounter++;
                        }else {
                            System.out.printf("%s%n",responsesObject.negativeResponses(false, rand.nextInt(4)));
                        }
                    } else if (mathOperation.equals("4")) {
                        System.out.printf("Question %d/10:How much does %d / %d equals?%n-Answer:",evaluationPoint, firstRandomNumber ,secondRandomNumber);
                        answer = input.nextInt();
                        if ((int) correctResult == answer){
                            System.out.printf("%s%n",responsesObject.positiveResponses(true, rand.nextInt(4)));
                            correctAnswersCounter++;
                        }else {
                            System.out.printf("%s%n",responsesObject.negativeResponses(false, rand.nextInt(4)));
                        }
                    }

                    if (evaluationPoint == 10) {
                        barResult = ((float) correctAnswersCounter / 10) * 100;
                        if (barResult > 75.0) {
                            System.out.printf("-Results:%.2f/100%n-Good Job.", barResult);
                            input.nextLine();
                            System.out.println("Do you want to change mathematical operation??(Y/N)");
                            String userChangeOperation = input.nextLine();
                            if (userChangeOperation.equals("Y")){
                                System.out.printf("What do you want to learn?%n-For addition type :1%n-For subtraction type :2%n-For multiplication type :3%n-For division type :4%n-Choice Field:");
                                mathOperationObject.setMethodToApply(input.nextLine());
                                mathOperation = mathOperationObject.getMethodToApply();
                            }else {
                                System.out.println("Do you want to continue?(Y/N)");
                                breakChoice = input.nextLine();
                                if (breakChoice.equals("N")){
                                    startLearning = false;
                                    System.out.println("See you next time!!!");
                                    break;
                                }else{
                                    evaluationPoint = 0;
                                    barResult = 0;
                                    correctAnswersCounter =0;
                                }
                            }
                            continue;
                        } else {
                            System.out.printf("-Results:%.2f/100%n-Take a break and read some more", barResult);
                            break;
                        }
                    }
                    evaluationPoint++;
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
