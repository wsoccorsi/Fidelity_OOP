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
        System.out.println("Hello World!");
//        Person p = new Person();
        Bank bank = new Bank("Chase", 500);
        Investor investor = new Investor("Bob", bank);
        System.out.println(investor.getName());

    }
}
