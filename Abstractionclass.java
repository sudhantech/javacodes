abstract class Payment{
  abstract void pay(double amount);
}
/*parent class use to over ride the payment class */
class UPIpayment extends Payment{

  @Override
  void pay(double amount){
      System.out.println("pay $:"+amount+"in UPIpayment");
  }
}
/*This is another class to access on payment class */
class CreditcardPayment extends Payment{

  @Override
  void pay(double amount){
    System.out.println("pay $:"+amount+"in Creditcard payment");
  }
}
/*Main class to get this two class output */
public class Abstractionclass{
  public static void main(String[] args) {
    /*create the object for the UPI payment class . use the object then call the method */
    Payment up=new UPIpayment();
    up.pay(1000);

    /*create the object for another class on creditcard payment .  */
    Payment cp=new CreditcardPayment();
    cp.pay(2000);
  }
}