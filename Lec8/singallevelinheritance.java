package Lec8;
class employee{
    void work (){
        System.out.println("Employeis working");
    }
}
class Manager extends employee{
    void attendmetting(){
        System.out.println("mannger is attend the metting");
    }
}
public class singallevelinheritance {
    public static void main(String[] args) {
        Manager obj=new Manager();
        
        obj.attendmetting();
        obj.work();
    }
}
