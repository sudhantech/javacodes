class Payment{
  void pay(){
    System.out.println("payment");
  }
}
class Creditcard extends Payment{

  @Override
  void pay(){
    System.out.println("Amount pay on creditcard");
  }
}
class UPI extends Payment{

  @Override
  void pay()
  {
    System.out.println("Amount pay on UPI");
  }
}
public class RuntimePolymorphismExample {
  public static void main(String args[]){
    Payment p;

    p =new Creditcard();
    p.pay();

    p= new UPI();
    p.pay();
  }
}
