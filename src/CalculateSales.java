public class CalculateSales {

    String productName;
    double productPrice;
    double totalEarnings;

        public CalculateSales (String productName, double productPrice){
            this.productName = productName;
            this.productPrice = productPrice;
        }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public double getProductPrice() {
        return productPrice;
    }

    public double calculateTotalEarnings(double productPrice, int saleAmount){
        totalEarnings  = productPrice * saleAmount;
        return totalEarnings;
    }


}
