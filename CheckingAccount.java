public class CheckingAccount {
    private double balance;
    private int accountNo;

    public CheckingAccount(double balance, int accountNo){
        this.balance = balance;
        this.accountNo = accountNo;
    }

    public void deposit(double amount) throws Exception{
        if(amount < 0){
            throw new Exception("You cannot deposit negative value.");
        }
        this.balance = amount;
    }

    public void withdraw(double amount){
        try{
            checkWithdraw(amount, this.balance);
            this.balance -= amount;
            System.out.println("The balance after withdrawal is: $" + this.balance);
        }catch(InsufficientFundsException e){
            e.printStackTrace();
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.accountNo;
    }

    public static boolean checkWithdraw(double amount, double balance) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Sorry, but your account is short by: $" + (amount - balance));
        }
        return true;
    }
}
