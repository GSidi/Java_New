import java.util.Scanner;

public class TestIncomeCalculator {

    public static void main(String[] args) {
        //variable declaration
        int numberOfWorkers;
        String firstName;
        String surname;
        double pricePerHour;
        double hoursWorked;
        double workerIncome;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of workers whose income you want to calculate:");
        numberOfWorkers = input.nextInt();
        input.nextLine(); // Consume the newline character
        while (numberOfWorkers >0){
            System.out.println("Enter workers first name: ");
            firstName = input.nextLine();
            System.out.println("Enter workers surname: ");
            surname = input.nextLine();
            System.out.println("Enter workers price per hour: ");
            pricePerHour = input.nextDouble();
            System.out.println("Enter workers hours worked: ");
            hoursWorked = input.nextDouble();
            input.nextLine(); // Consume the newline character

            IncomeCalculator worker = new IncomeCalculator(firstName, surname, pricePerHour, hoursWorked);
            workerIncome = worker.calculateIncome(pricePerHour, hoursWorked);
            System.out.printf("-Worker: %s %s%n-Price Per Hour: %.2f%n-Hours Worked: %.2f%n-Monthly Income: %.2f%n",
                    firstName, surname , pricePerHour, hoursWorked, workerIncome);
            numberOfWorkers -= 1;
        }
    }

}
