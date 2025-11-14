package Lec8;
class Book{
    void read(){
        System.out.println("Reading a book");
    }
}
class Novel extends Book{
    void Story(){
        System.out.println("The novel is an interesting story");
    }
}
public class Inheritamce4 {
    public static void main(String[] args) {
        Novel obj = new Novel();
        obj.read();
        obj.Story();
        
    }
    
}
