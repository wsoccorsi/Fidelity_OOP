public class Investor extends Person {

    private Bank bank; //added functionality
    private FinancialService fs;

    public Investor(String name, Bank bank, FinancialService fs) {
        super(name); //call the super class constructor :))
        this.bank = bank;
        this.fs = fs;
    }

    public Bank getBank(){ return this.bank; }

    public FinancialService getFS(){ return this.fs; }

    //abstraction
    public String transferMoneyToFS(double amount) {

        if (this.bank.getBalance() - amount < 0){
            return "Insufficient Funds";
        }

        this.fs.setBalance(this.fs.getBalance() + amount);
        this.bank.setBalance(this.bank.getBalance() - amount);
        return "Transaction Success";


    }
    //abstraction
    public String transferMoneyToBank(double amount) {

        if (this.fs.getBalance() - amount < 0) {
            return "Insufficient Funds";
        }

        this.bank.setBalance(bank.getBalance() + amount);
        this.fs.setBalance(this.fs.getBalance() - amount);

        return "Transaction Success";


    }

    public String speak(){
        return "Hi my name is " + this.getName() + ", I have " + this.getBank().getBalance() +
                "$ in my " + this.getBank().getName() + " bank account and " + this.getFS().getBalance() + "$ in my " +
                this.getFS().getName() + " account";
    }
}
