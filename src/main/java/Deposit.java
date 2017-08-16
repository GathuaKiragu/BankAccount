
public class Deposit{
  private int id;
  private int accountNumber;
  private double amount;

  // Constructor
  public Deposit(int accountNumber, double amount){
    this.accountNumber=accountNumber;
    this.amount=amount;
  }

  // getter methods
  public int getAccountNumber(){
    return accountNumber;
  }

  public double getAmount(){
    return amount;
  }
}
