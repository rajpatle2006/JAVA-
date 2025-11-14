package Lec8;
class Device{
    void poweron(){
        System.out.println("Device is on");
    }
}
class Laptop extends Device{
    void brand(){
        System.out.println("Brand: Asus espertbook p1");
    }
}
class Power extends Laptop{
    void powerfullgaming (){
        System.out.println("Higher perfomance laptop");
    }
}
public class Inheritance3 {
    public static void main(String[] args) {
        Power p=new Power();
        p.poweron();
        p.brand();
        p.powerfullgaming();


    }
    
}
