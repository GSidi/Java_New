public class Invoice {

    private int quantity;
    private double pricePerItem;
    private double total_price;
    private String description;
    private String serialNumber;

    public Invoice(String serialNumber, String description, int quantity, double pricePerItem){
        this.serialNumber = serialNumber;
        this.description = description;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getDescription() {
        return description;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
        if (pricePerItem < 0.0){
            this.pricePerItem = 0.0;
        }
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        if (quantity < 0){
            this.quantity = 0;
        }
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public double InvoiceCalculation(int quantity, double pricePerItem){
        total_price = quantity * pricePerItem;
        return  total_price;
    }

}
