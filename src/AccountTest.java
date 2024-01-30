import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //object creation in java
        Account myAccount = new Account("Sidi");

        System.out.printf("Initial name is : %s%n", myAccount.getName());
        System.out.println("Please enter a new name :");
        String newName = input.nextLine();
        myAccount.setName(newName);
        System.out.println();

        System.out.printf("Name in object myAccount is : %s%n",myAccount.getName() );
    }

}
