public record BankAccount(String numberAccount, double balance) {
    public BankAccount(String numberAccount){
        this(numberAccount, 0.0);
    }

    public BankAccount withInterest(double percentage){
        double newBalance = this.balance + (this.balance * percentage / 100);
        return new BankAccount(this.numberAccount, newBalance);
    }
}