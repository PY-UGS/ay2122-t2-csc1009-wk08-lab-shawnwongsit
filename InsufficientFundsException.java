public class InsufficientFundsException extends Exception{
    private double amount;

    public InsufficientFundsException(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    //Exception handling
    public InsufficientFundsException(String message){
        super(message);
    }

    
}
