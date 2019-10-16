public class FinancialService {

    private double balance;
    private String name;
    private Bank bank;

    FinancialService(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(){ return this.name; }

    public double getBalance(){ return this.balance; }

    public void setBalance(double balance){ this.balance = balance; }

    public void withdrawlFromFS(double amount) { this.balance = this.balance - amount; }




}
