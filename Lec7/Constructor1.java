package Lec7;
class car {
   int a;
   car(int a){
       this.a=a;
   }
    
}

public class Constructor1 {
    public static void main(String[] args) {
      car obj=new car(5);
     // obj.a
      System.out.println(obj.a);
}
}
