public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public void deposite(int amount){
        balance += amount;
    }

    public double withdraw(int amount){
        if (balance < amount){
            System.out.println("You doesn't have sufficient amount");
        }else {
        balance -= amount;
        }
        return balance;
    }

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount one = new BankAccount(4327 , "Rahul", 2400);
        one.deposite(500);
        one.withdraw(100);
        System.out.println(one.balance);
    }
}
