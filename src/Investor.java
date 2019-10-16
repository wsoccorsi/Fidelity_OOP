public class Investor extends Person {

    private Bank bank; //added functionality
    private FinancialService fs;

    public Investor(String name, Bank bank) {
        super(name); //call the super class constructor :))
        this.bank = bank;
    }

    public void withdrawlFromBank(double amount) { bank.setBalance(bank.getBalance() - amount); }

    public double getBankBalance(){ return this.bank.getBalance(); }


}
