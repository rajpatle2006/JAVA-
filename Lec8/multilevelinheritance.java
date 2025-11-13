package Lec8;
//import java.util.*;
//multilevel inheritance 
class Animal{       //parentclass
    void Eat(){
        System.out.println("burger");
    }
}
class Doges extends Animal{    //childclass
    void bark(){
        System.out.println("Bhoo Bhoo");
    }
}   
class puppy extends Doges {      //subdrivedclass
    void run(){
        System.out.println("hehehe");
    }
    
} 
public class multilevelinheritance {
    public static void main(String[] args) {
     puppy obj= new puppy();
        obj.bark();
        obj.Eat();
        obj.run();
    }
    
}

