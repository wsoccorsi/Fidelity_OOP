public class Investor extends Person {

    private Bank bank; //added functionality

    public Investor(String name, Bank bank) {
        super(name);
        this.bank = bank;
    }

}
