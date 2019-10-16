public class Investor extends Person {

    private Bank bank; //added functionality

    public Investor(String name, Bank bank) {
        super(name);
        this.bank = bank;
    }

    public void withdrawl(double amount) { bank.setBalance(bank.getBalance() - amount); }

    public double getBalance(){ return this.bank.getBalance(); }
}
