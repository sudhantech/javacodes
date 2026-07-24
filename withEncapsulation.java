class Student{
  private String name;
  private int age;

  public void setName(String n){
    name=n;
  }
  public String getName(){
    return name;
  }

  public void setAge(int a){
    age=a;
  }

  public int getAge(){
    return age;
  }

}

public class withEncapsulation {
  public static void main(String args[]){
    Student s=new Student();

    s.setName("sudhan");
    s.setAge(21); //valide age

    System.out.println("Name :"+s.getName());
    System.out.println("Age :"+s.getAge());
  }
}
