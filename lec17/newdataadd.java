package lec17;

import java.io.*;
import java.io.FileWriter;

public class newdataadd {
    public static void main(String[] args) {
     
        createData();
        //  try{
        //     File file =new File("my.java");
        //     if(file.createNewFile()){
        //         System.out.println("Done" +   "file.getName()");
        //     }else{
        //         System.out.println("already file created");

        //         }
        //     }catch (Exception e){
        //         System.out.println(e);
        //     }
        
    }
    static void createData(){
        try {
            FileWriter writer=new FileWriter("my.java",true);
            writer.write("tha value  ");
            writer.close();
        } catch (Exception e){
            System.out.println(e);

        }
    }
    
}
    
    

