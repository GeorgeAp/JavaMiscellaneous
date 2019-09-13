public class BankAccount {
    private double balance;

    // constructor
    public BankAccount(double openingBalance){
        balance = openingBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public void display(){
        System.out.println("Balance " + balance);
    }

}

class BankApp{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(100.00); // creates account
        System.out.print("Before transactions, ");
        account1.display();

        account1.deposit(74.35);
        account1.withdraw(20.00);

        System.out.print("After transaction, ");
        account1.display();
    }
}
