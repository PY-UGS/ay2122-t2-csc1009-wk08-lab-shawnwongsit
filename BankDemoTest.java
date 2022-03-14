public class BankDemoTest {
    
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount(0, 123456);
        try{
            acc.deposit(-1000);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(acc.getBalance());
        System.out.println(acc.getNumber());
        acc.withdraw(1100);
        System.out.println(acc.getBalance());
    }
}
