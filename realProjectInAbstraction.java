
abstract class Payment{
  abstract void pay(double amount);
}
class UPI extends Payment{
  void pay(double amount){
    System.out.println("UPI  amount  :" +amount);
  }
}
class Creditcard extends Payment{
  void pay(double amount){
    System.out.println("Credit card amount"+amount);
  }
}
public class realProjectInAbstraction { 
  public static void main(String[] args) {
    UPI upi=new UPI();
    Creditcard cd=new Creditcard();

    upi.pay(5000);
    cd.pay(10000);
  }
}
