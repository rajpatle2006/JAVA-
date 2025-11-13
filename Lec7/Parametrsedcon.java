package Lec7;

// class car{
//    car (String str){
//     System.out.println(str);

//  }
// }
// public class Parametrsedcon {
//     public static void main(String[] args) {
//         car obj= new car("hello asus");
//         car obj1= new car("hello raj");
        
//     }
    
// }
class car {
   int a;
   car(int a){
    this.a=a;
   }
    
}

public class Parametrsedcon {
    public static void main(String[] args) {
      car obj=new car(5);
     // obj.a
      System.out.println(obj.a);
}
}
