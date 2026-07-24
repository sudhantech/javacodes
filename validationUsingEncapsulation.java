class Students{
  private String name;
  private int age;

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setAge(int age)
  {
    if(age > 0){
       this.age=age;
    }
    else{
      System.out.println("Invalid Age");
    }
  }

  public int getAge(){
    return age;
  }

}

public class validationUsingEncapsulation{
  public static void main(String args[]){
    Students s=new Students();

    s.setName("sudhan");
    s.setAge(-21);

    System.out.println("Name :"+s.getName());
    System.out.println("Age :"+s.getAge());
  }
}
