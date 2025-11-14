package Lec8;
class Person{
    void Displayname(){
        System.out.println("Name: Raj");
    }
}
class student extends Person{
    void displaycollage(){
        System.out.println("Collage Global the best");
    }
}
class Moniter extends student {
   void displayDicipilane(){
    System.out.println("Moniter is checking diciplane");
   }
    
}
public class Inheritance1 {
    public static void main(String[] args) {
        Moniter mon=new Moniter();
    
        mon.Displayname();
        mon.displaycollage();
         mon.displayDicipilane();
    }
}
