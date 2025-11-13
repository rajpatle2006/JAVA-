

import java.util.Scanner;

class Area{
   int length;
   int  breath;
    void inputvalue(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length of ractangle: ");
        length =sc.nextInt();
        System.out.println("Enter of breath of reactangle: ");
        breath = sc.nextInt();
    
    }
    void display(){
        System.out.println("Area ="+length*breath);
    
    }

}
public class Rectangle {
    public static void main(String[] args) {
        Area obj=new Area();
        obj.inputvalue();
       obj.display();
    }
    
}


