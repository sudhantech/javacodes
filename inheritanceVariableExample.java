class Animal{
  String color;
}
class Dog extends Animal{
   void display(String color){
    this.color=color;
    System.out.println("Dog color is "+color);
  }
}
public class inheritanceVariableExample {
  public static void main(String args[]){
    Dog dg=new Dog();
    dg.display("brown");
  }
}
