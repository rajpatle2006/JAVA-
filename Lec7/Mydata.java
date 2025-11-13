 package Lec7;
 class data {
    String information;
    int num;
    int rollnum;
    int name;
    float cgpa;
    double mark;
    void display(){ 
       System.out.println("799973823"  + "  number"+(num));
       System.out.println("raj"  + "  my name"+(name)); 
       System.out.println("7.6"  + "  result"+(cgpa)); 
       System.out.println("76"  + " marks "+(mark)); 
       System.out.println("raj"  + "  my name"+(name)); 
       System.out.println( "261"   + "roll num"  +(rollnum));
    }
}
public class Mydata{
    public static void main(String[] args) {
        data obj= new data();
        obj.display();
    }
}
