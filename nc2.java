import java.util.Scanner;
class nc2 {
  public static void main(String [] args){
    Scanner scan=new Scanner(System.in);
  System.out.println("Enter your name :");
  String name =scan.nextLine();
  System.out.println("Enter your age : ");
  int age=scan.nextInt();
  if(age == 18 || age >=18)
  {
    System.out.println("if you are eligible for voting ");
  }
  else{
    System.out.println("if your not above 18 , your not eligible for voting!");
  }
  }  

}
