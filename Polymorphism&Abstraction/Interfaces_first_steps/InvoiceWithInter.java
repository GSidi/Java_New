public class InvoiceWithInter implements Payable{

    private  String partNumber;
    private  String partDescription;
    private int quantity;
    private double pricePerItem;
    public InvoiceWithInter(String partNumber, String partDescription,
                            int quantity, double pricePerItem){
        this.partDescription = partDescription;
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public double getPayments() {
        return getQuantity() * getPricePerItem();
    }
}
