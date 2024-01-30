public class Account {

    private String name;
    private  double balance;

    //constructor function
    public Account(String name, Double balance){
        this.name = name;
        if (balance>0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmmount){

        if (depositAmmount > 0.0){
            balance = balance + depositAmmount;
        }
    }
    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
