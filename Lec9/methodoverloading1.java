package Lec9;
class Count{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(float a,float b){
        System.out.println(a+b);
    }
}
public class methodoverloading1 {
    public static void main(String[] args) {
        Count obj=new Count();
        obj.sum(5, 5);
        obj.sum(5, 9,4);
        obj.sum(5.5f,7.9f);

    }
}
