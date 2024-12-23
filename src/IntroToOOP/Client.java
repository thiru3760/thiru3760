package IntroToOOP;

public class Client {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        System.out.println("Initial balance: " + bankAccount.getBalance());

        System.out.println("Current balance: " + bankAccount.getBalance());
        bankAccount.deposit(1000);

        bankAccount.withdraw(100);
        bankAccount.printDetails();

        bankAccount.withdraw(100);
        bankAccount.deposit(1000);
        bankAccount.withdraw(100);
        bankAccount.deposit(10);
        bankAccount.withdraw(100);
        bankAccount.deposit(100);
        bankAccount.withdraw(100);
        bankAccount.printTransactionHistory();
        bankAccount.printDetails();


    }
}
