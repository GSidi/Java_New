import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("George Sidiropoulos", 500.00);
        Account account2 = new Account("Dimitris Sidiropoulos", 600.00);

        System.out.printf("%s balance is : %.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance is : %.2f%n",account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a deposit amount for account1 :");
        double deposit = input.nextDouble();
        System.out.printf("Adding %.2f to account1 %n", deposit);
        account1.deposit(deposit);
        System.out.printf("%s balance is : %.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance is : %.2f%n",account2.getName(),account2.getBalance());

        System.out.println("Please enter a deposit amount for account2 :");
        deposit = input.nextDouble();
        System.out.printf("Adding %.2f to account2 %n", deposit);
        account2.deposit(deposit);

        System.out.printf("%s balance is : %.2f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance is : %.2f%n",account2.getName(),account2.getBalance());

    }

}
