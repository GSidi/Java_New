import java.util.Scanner;
public class CalculateSalesTest {

    public static void main(String[] args) {
        int noOfProducts;
        int i;
        String nameOfProduct;
        double priceOfProduct;
        int totalSalesOfProduct;
        double affordability;
        String affordabilityResponse;

        Scanner input = new Scanner(System.in);
        System.out.print("How many product do you want to add?:");
        noOfProducts = input.nextInt();
        for (i = 0; i <= noOfProducts; i++){
            System.out.println("Give name of the product:");
            nameOfProduct = input.nextLine();
            input.next();
            System.out.println("Give price of the product:");
            priceOfProduct = input.nextDouble();
            System.out.println("Give total sales of the product:");
            totalSalesOfProduct = input.nextInt();

            CalculateSales salesObject = new CalculateSales(nameOfProduct,priceOfProduct);
            salesObject.setProductName(nameOfProduct);
            salesObject.setProductPrice(priceOfProduct);
            affordability = salesObject.calculateTotalEarnings(priceOfProduct,totalSalesOfProduct);

            if (affordability >=100.0){
                affordabilityResponse = "Very Expensive";
            }else if (affordability == 50.0){
                affordabilityResponse = "So-So";
            }else{
                affordabilityResponse = "Cheap";
            }

            System.out.printf("%nProduct %d%nName:%s5%nPrice:%.2f%nTotal Sales:%d%nAffordability:%s%n",i ,salesObject.getProductName() ,salesObject.getProductPrice() ,
                    totalSalesOfProduct ,affordabilityResponse);

        }

    }
}
