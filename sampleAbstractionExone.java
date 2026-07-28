abstract class Vehicle{
  abstract void start();
}

class Bike extends Vehicle{
  void start(){
    System.out.println("Bike starting with kick");
  }
}
class car extends Vehicle{
  void start(){
    System.out.println("Cas start with key");
  }
}
public class sampleAbstractionExone {
  public static void main(String[] args) {
    Bike b=new Bike();
    car c=new car();

    b.start();
    c.start();
}
}