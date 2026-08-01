/*now we use on two different concepts, One is normal abstract method and another one is constructor */
abstract class Animal{
  Animal(){
    System.out.println("Animal constructor");/*Constructor  */
  }

  abstract void sound();/*normal methods */
}
/*Dog class to initiate this two methods */
class Dogs extends Animal{

  Dogs(){
    System.out.println("Dog constructor");
  }

  void sound(){
    System.out.println("woof");
  }
}
public class constructorabstractionclass {
  public static void main(String[] args) {
    Dogs ad=new Dogs();
  }
}
