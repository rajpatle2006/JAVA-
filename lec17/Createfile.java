package lec17;
import java.io.*;
//import java.nio.channels.Pipe.SourceChannel;
public class Createfile {
    public static void main(String[] args) {
        try{
            File file =new File("home.java");
            if(file.createNewFile()){
                System.out.println("Done" +   "file.getName()");
            }else{
                System.out.println("already file created");

                }
            }catch (Exception e){
                System.out.println(e);
            }
                
            }
        
        
    }

  