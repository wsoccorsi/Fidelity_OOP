//*** Types of JAVA inheritance
//Single Inheritance
//Multi-level Inheritance
//Hierarchical Inheritance
//Hybrid Inheritance
//Multiple Inheritance

/**
 * The idea is to use all types of OOP concepts
 * Abstraction
 * Polymorphism
 * Inheritance
 * Encapsulation
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Inheritance!");
        Bank bank = new Bank("Chase", 500);
        FinancialService fs = new FinancialService("Fidelity", 0);
        Investor investor = new Investor("Bob", bank, fs);
        System.out.println(investor.getName()); // an example of using the inherited get name

        //withdrawl 200 from bank
        investor.getBank().withdrawlFromBank(200);
        System.out.println(investor.getBank().getBankBalance());


        investor.transferMoneyToFS(300);
        System.out.println(investor.getBank().getBankBalance());
        System.out.println(investor.getFS().getBalance()); //fs balance negative


        //expected to fail "Insufficient Funds"
        System.out.println(investor.transferMoneyToFS(200));
        System.out.println(investor.getBank().getBankBalance());
        System.out.println(investor.getFS().getBalance());


        //transfer all back
        System.out.println(investor.transferMoneyToBank(300));
        System.out.println(investor.getBank().getBankBalance());





    }
}
