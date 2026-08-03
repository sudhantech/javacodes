abstract class shape{
  abstract void draw();
}

class Circle extends shape{

  void draw()
  {
    System.out.println("draw a Circle diagram");
  }
}

class Rectangle extends shape{

  void draw(){
    System.out.println("draw a Rectangle diagram");
  }
}

public class abstractionAndpolymorphism {
  public static void main(String[] args) {
    shape s;

    s=new Circle();
    s.draw();

    s=new Rectangle();
    s.draw();
  }
}
