class parent{
  void eating(){
    System.out.println("Animel in eating");
  }
}
class child extends parent{
  void bark(){
    System.out.println("Dog is barking");
  }
}
public class basicInheritance{
  public static void main(String args[]){
    child ch=new child();
    ch.eating();
    ch.bark();
  }
}
