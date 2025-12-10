package Lec16;

public class execeptaionhandling{
    public static void main(String[] args) {
        try{
            voteage (1);
        } catch(Exception e){
            System.out.println(e);

        }
    }
    static void voteage(int age){
        System.out.println("check vote ");
        if(age<18){
            throw new IllegalArgumentException( "aap vote nahi de sakta hai ");
        }
        else{
            System.out.println("aap vote de sakta hai");
        }
    }
}

