class Bank{
  private double balance;

  public void deposit(double amount){
    if(amount >0){
      balance += amount;
    }
  }

  public void withdraw(double amount){
    if(amount <= 0){
      balance -= amount;
    }
    else{
      System.out.println("insufficent balance");
    }
  }

  public double getBalance(){
    return balance;
  }
}
public class Bankaccounts {
  public static void main(String args[]){
    Bank bk=new Bank();

    bk.deposit(5000);
    bk.withdraw(1000);

    System.out.println(bk.getBalance());
  }
}
