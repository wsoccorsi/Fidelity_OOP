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
        Investor investor = new Investor("Bob", bank);
        System.out.println(investor.getName()); // an example of using the inherited get name

        //withdrawl 200
        investor.withdrawl(200);
        System.out.println(investor.getBalance());

    }
}
