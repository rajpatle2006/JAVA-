package Lec8;
import java.util.*;
//multilevel inheritance 
class Animal{       //parentclass
    void eat(){
        System.out.println("pizza");
    }
}
class Doges extends Animal{    //childclass
    void bark(){
        System.out.println("Bhoo Bhoo");
    }
}   
class puppy extends Doges {      //subdrivedclass
    void run(){
        System.out.println  ("bhago");
    }
    
} 
public class multilevelinheritance {
    public static void main(String[] args) {
     puppy obj= new puppy();
     obj.eat();
        obj.bark();
        obj.run();
        
    }
    
}



