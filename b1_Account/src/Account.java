public class Account {
    private double balance = 0;

    public Account(){}
    public Account(double balance){this.balance = balance;}

    public void deposit(double input1) {balance += input1;}

    public void withdraw(double input1) {balance -= input1;}

    public double getBalance() {return balance;}
}
