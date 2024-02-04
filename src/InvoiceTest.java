import java.util.Objects;
import java.util.Scanner;
public class InvoiceTest {

    public static void main(String[] args) {
        //varialbe declerations
        String itemSerialNumber;
        String itemDescription;
        String userChoice;
        int itemQuantity;
        double pricePerItem;

        //user input creation
        Scanner input = new Scanner(System.in);

        //Invoice object creation
        Invoice invoiceObject = new Invoice("x150", "screws", 50, 2.5);
        System.out.printf("The default SN is %s%nThe default description is %s%nThe default quantity is %d%nThe default price per item is %.2f%n",
                invoiceObject.getSerialNumber(),invoiceObject.getDescription(),invoiceObject.getQuantity(),invoiceObject.getPricePerItem());

        System.out.println("Give the SN of the item:");
        itemSerialNumber = input.nextLine();
        invoiceObject.setSerialNumber(itemSerialNumber);

        System.out.println("Give the description of the item:");
        itemDescription = input.nextLine();
        invoiceObject.setDescription(itemDescription);

        System.out.println("Give desired quantity :");
        itemQuantity = input.nextInt();
        invoiceObject.setQuantity(itemQuantity);

        System.out.println("Give the price per item:");
        pricePerItem = input.nextDouble();
        invoiceObject.setPricePerItem(pricePerItem);

        // Consume the newline character left in the buffer
        input.nextLine();

        System.out.println("Do you want to calculate the invoice price?(Y/N)");
        userChoice = input.nextLine();
        if (Objects.equals(userChoice, "Y")) {
            //System.out.printf("The invoice amount is: %.2f", invoiceObject.InvoiceCalculation(itemQuantity, pricePerItem));
            System.out.printf("Invoice Details:%n-Serial Number: %s%n-Description:%s%n-Quantity:%d%n-Price Per Item:%.2f%n-Total Cost:%.2f%n",
                    invoiceObject.getSerialNumber(),invoiceObject.getDescription(),invoiceObject.getQuantity(),invoiceObject.getPricePerItem(),invoiceObject.InvoiceCalculation(itemQuantity, pricePerItem));
        }else{
            System.out.println("See you next time");
        }


    }
}
