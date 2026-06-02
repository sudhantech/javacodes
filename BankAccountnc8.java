class Bankaccount{
  private int accountNumber;
  private double balance;

  public int getAccountnumber(){
      return accountNumber;
  }
  
  public void setAccountnumber(int accounctNumber){
    this.accountNumber=accounctNumber;
  }

  public double getBalance()
  {
      return balance;
  }
    public void deposit(double amount)
    {
      if(amount >0){
        balance+= balance;
        System.out.println("Deposit successful! Amount: " + amount);
      }
      else{
        System.out.println("Deposit amount must be positive!");
      }
    }

    public void Withdraw(double amount)
    {
      if(amount >0 && amount<= balance)
        {
          balance-=balance;
          System.out.println("Withdrawal successful! Amount: " + amount);
        }
      else
        {
          System.out.println("Invalid withdrawal amount!");
        }
    }
  }

public class BankAccountnc8 {
  public static void main(String args[]){
    Bankaccount BA=new Bankaccount();
    BA.setAccountnumber(12345); 
    BA.deposit(12000);
    BA.Withdraw(5000);

    System.out.println("Account Number :"+BA.getAccountnumber());
    System.out.println("Final Balance :"+BA.getBalance());
  }
}
