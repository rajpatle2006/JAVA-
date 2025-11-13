package Lec8;
class Hello{
  public Hello(){
    this(5);
    System.out.println("hii");
  }
  public Hello(int a){
    this(5,6);
    System.out.println(a);
  }
  public Hello(int a, int b){
    System.out.println(a);
    System.out.println(b);
  }
  }

public class staticconstructor {

    public static void main(String[] args) {
       // Hello obj=new Hello();
    }
}
