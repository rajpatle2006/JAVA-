package Lec8;
// 1 Singlelevel inheritance
class Animal {          //parents class
    void eat(){
        System.out.println("pizza");
    }
}
class Doges extends Animal{    //childclass
    void bark(){
        System.out.println("Bhoo Bhoo");
    }
}    
    

public class Inheritance {
    public static void main(String[] args) {
        
   Doges obj= new Doges();
        obj.bark();
        obj.eat();
    }
}