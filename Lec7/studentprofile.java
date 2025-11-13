package Lec7;
class mydata1 {
    
    String information;
    int num;
    int rollnum;
    int name;
    float cgpa;
    double mark;
    void display(){ 
       //System.out.println(   "  number"+(num));
       System.out.println( "  my name"+(name)); 
       System.out.println( "  result"+(cgpa)); 
       System.out.println( " marks "+(mark)); 
       System.out.println("  my name"+""+(name)); 
       System.out.println( "roll num"  +(rollnum));
    }
}
public class studentprofile{
    public static void main(String[] args){
        mydata1 s1=new mydata1();
        //s1.name=raj;
        s1.rollnum=261;
        s1.mark=76;
        s1.display();
    }
}

