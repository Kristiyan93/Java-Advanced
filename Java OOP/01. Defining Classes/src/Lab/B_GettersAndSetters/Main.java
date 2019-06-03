package Lab.B_GettersAndSetters;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setId(1);
        account.deposit(13);

        try {
            account.withdrow(15);
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }

        System.out.println(account);
    }
}
