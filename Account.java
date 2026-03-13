public class Account {
    int accountNumber;
    String accountHolderName;
    double balance;

    public Account(int num, String name, double balance){
        accountNumber = num;
        accountHolderName = name;
        this.balance = balance;
    }

    public void setAccountNumber(int newNumber){
        accountNumber = newNumber;
    }
    public void setAccountHolderName(String newName){
        accountHolderName = newName;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }

    public double deposit(double amountToDeposit){
        return balance += amountToDeposit;
    }

    public double withdraw(double amountToWithdraw){
        return balance -= amountToWithdraw;
    }

}
