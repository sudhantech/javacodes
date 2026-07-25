class Bike{
  void sound(){
    System.out.println("RX100 bike will produce more noice");
  }
}
class Bullet extends Bike{
  @Override
  void sound(){
    System.out.println("Bullet is more then time higher noice producing in RX100");
  }
}
public class RuntimePolymorphism {
  public static void main(String args[]){
    Bullet b=new Bullet();

    b.sound();
  }
}
