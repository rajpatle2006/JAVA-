package Lec8;
class Shape{
    void draw(){
        System.out.println("Drwing the shape");

    }
}
class Circle extends Shape{
  void calculatearea(){
    System.out.println("The area is circle");
  }
}
public class Inheitance2 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.draw();
        c1.calculatearea();
    }
}
