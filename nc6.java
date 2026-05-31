import java.util.Arrays;

class Student{

  private String name;

  public void setName(String name)
  {
    this.name=name;
  }

  public String getName(){
    return name;
  }
}
public class nc6 {
  public static void main(String args[])
  {
    Student s=new Student();
    s.setName("He is sabari my best student");

    System.out.println("student : "+s.getName());
  }
  
}
