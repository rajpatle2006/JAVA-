package Lec9;
class hello{
    void sum(){
        System.out.println("hey");
    }
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a,int b){      // methodes overloading
        System.out.println(a+b);
    }
}

public class  Methodeoverlaping{
    public static void main(String[] args) {
        hello obj=new hello();
        obj.sum(5,5);
        obj.sum();
        obj.sum(12);
    }
}
