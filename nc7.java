

class student{

  private String name;
  private int age;

  public String getName(){
    return name;
  }
  
  public void setName(String name){
    this.name=name;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age)
  {
    if(age>=18){
      System.out.println("your age is 18 and above 18 , eligile for voting");
    }
    else{
      System.out.println("your age is not above 18 , not eligible for voting");
    }
  }
}
public class nc7 {
  public static void main(String [] args){
    student s=new student();
    s.setName("alax");
    s.setAge(22);

    System.out.println("Name : "+s.getName());
    System.out.println("Age : "+s.getAge());
  }
}
