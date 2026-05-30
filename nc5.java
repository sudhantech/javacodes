class employee{

  private int salary;

  public void setSalary(int salary){
    this.salary=salary;
  }

  public int getSalary(){
    return salary;
  }
}
public class nc5 {
  public static void main(String [] args){
    employee e=new employee();
    e.setSalary(50000);
    System.out.println("salary :"+e.getSalary());
  }
}
