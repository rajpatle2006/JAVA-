package lec17;

import java.io.*;

public class Deletedata {
    public static void main(String[] args) {
        Deletefiledata();
    }
    static void Deletefiledata(){
        try{
            File file=new File("my.java") ;
            if(file.delete()){
                System.out.println("deleted");
            }else{

            }
        
    }
    catch (Exception e){

    }
}
}
