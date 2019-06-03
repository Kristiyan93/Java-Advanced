package Lab.A_DefineBankAccountClass;

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.id = 1;
        acc.balance = 15;

        System.out.printf("Account ID%04d, balance %.2f", acc.id, acc.balance);
    }
}
