class Employee{
  private String name;
  private int id;
  private double salary;

  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setId(int id){
    this.id=id;
  }
  public int getId(){
    return id;
  }
  public void setSalary(double salary){
    if(salary >0){
      this.salary=salary;
    }
  }
  public double getSalary(){
    return salary;
  }
}

public class ex1Encapsulation {
  public static void main(String args[])
  {
    Employee emp=new Employee();

    emp.setName("sudhan");
    emp.setId(1);
    emp.setSalary(40000);

    System.out.println("name   :"+emp.getName());
    System.out.println("id     :"+emp.getId());
    System.out.println("salary :"+emp.getSalary());
  }
}
