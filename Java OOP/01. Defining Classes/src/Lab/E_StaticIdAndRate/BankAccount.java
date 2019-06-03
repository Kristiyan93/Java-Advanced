package Lab.E_StaticIdAndRate;

public class BankAccount {

    private Integer id;
    private Double balance = 0.0;
    private static final Double interestRate = 0.02;
    private static Double rate = 0.02;


    public Double getBalance() {
        return this.balance;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public static void setInterestRate(Double interest) {
        rate = interest;
    }

    public Double getInterest(int years) {
        return this.balance * rate * years;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
