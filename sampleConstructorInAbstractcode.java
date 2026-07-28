abstract class Animal {

    Animal() {
        System.out.println("Constructor");
    }

}
class Dog extends Animal{

}
public class sampleConstructorInAbstractcode {
  public static void main(String[] args) {
    Dog d=new Dog();
    d.Animal();
  }
}
