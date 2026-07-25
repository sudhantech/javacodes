class Employe{
  String company ="Sudhan Technologie";

  void work(){
    System.out.println("Employee is working");
  }
}
class Developer extends Employe{
  void code(){
    System.out.println("Writing java code");
  }
}
public class realExampleInheritance {
  public static void main(String args[]){
    Developer dp=new Developer();

    dp.work();
    dp.code();
  }
}
