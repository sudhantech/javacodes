class Student{
  String name;
  int age;

  void display()
  {
    System.out.println(name +"age is "+age);
  }
}

public class withoutEncapsulation {
  public static void main(String args[])
  {
    Student s= new Student();
    s.name="rahul";
    s.age=-20; //Invalid age

    s.display();
  }
}
