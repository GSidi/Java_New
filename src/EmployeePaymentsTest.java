import java.util.Scanner;
public class EmployeePaymentsTest {
    public static void main(String[] args) {
        double addBonus;
        double newIncome;
        String choiceRaise;
        double newRaise;

        Scanner input = new Scanner(System.in);
        EmployeePayments employee1 =  new EmployeePayments("George", "Sidiropoulos", 1480.50, 10.00, 150.5);

        System.out.printf("Employee %s %s has :%n-Income:%.2f%n-Bonus:%.2f%n-Raise(TBD):%.2f%n",
                employee1.getSurname(),employee1.getSurname(),employee1.getIncome(),employee1.getBonus(),employee1.getRaise());

        System.out.printf("Add a new bonus for employee %s:", employee1.getSurname());
        addBonus = input.nextDouble();
        employee1.setBonus(addBonus);

        newIncome = employee1.addBonus(employee1.getIncome(), addBonus);
        employee1.setIncome(newIncome);
        System.out.printf("The new income per month for the employee %s %s is: %.2f%nThe yearly income is : %.2f%n"
                , employee1.getSurname(),employee1.getName(),employee1.getIncome(),employee1.yearlyIncome(newIncome));


        input.nextLine();
        System.out.println("Do you want to add a raise?(Y/N)");
        choiceRaise = input.nextLine();

        if (choiceRaise.equals("Y")){
            System.out.println("Add a raise for the employee:");
            newRaise = input.nextDouble();
            employee1.setRaise(newRaise);
            newIncome = employee1.giveRaise(newIncome, newRaise);
            employee1.setIncome(newIncome);
            System.out.printf("The raise was :%.2f%n", newRaise);
            System.out.printf("The new income per month for the employee %s %s is: %.2f%nThe yearly income is : %.2f%n"
                    , employee1.getSurname(),employee1.getName(),employee1.getIncome(),employee1.yearlyIncome(newIncome));
            System.out.printf("Employee %s %s has :%n-Income:%.2f%n-Bonus:%.2f%n-Raise(TBD):%.2f%n",
                    employee1.getSurname(),employee1.getSurname(),employee1.getIncome(),employee1.getBonus(),employee1.getRaise());

        }


    }
}
