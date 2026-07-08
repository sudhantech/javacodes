import java.util.*;

class nc8{  
  public static void main(String args[])
  {
    int a=10;

    for(int i=0;i<20;i=i+1){
      System.out.println(a++ + a++ - a++);
    }
  }
}