public class Bank {


    private String name;
    private double balance;

    public Bank(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() { return this.balance; }

    public void setBalance(double amount){ this.balance = amount; }

    public void withdrawlFromBank(double amount) { this.balance = this.balance - amount; }

    public double getBankBalance(){ return this.balance; }




}
