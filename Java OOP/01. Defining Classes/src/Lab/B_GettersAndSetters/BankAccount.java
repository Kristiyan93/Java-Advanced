package Lab.B_GettersAndSetters;

public class BankAccount {

    private int id;
    private double balance;

    public void setId(int id) {
        this.id = id;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrow(double amount) {
        if (this.balance - amount < 0) {
            throw new IllegalStateException("Insufficient balance.");
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount id" + id +
                ", balance = " + balance;
    }
}
