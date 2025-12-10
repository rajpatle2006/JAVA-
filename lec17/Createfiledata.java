package lec17;

import java.io.File;
import java.io.FileWriter;

public class Createfiledata {
    public static void main(String[] args) {
        createData();
         try{
            File file =new File("my.java");
            if(file.createNewFile()){
                System.out.println("Done" +   "file.getName()");
            }else{
                System.out.println("already file created");

                }
            }catch (Exception e){
                System.out.println(e);
            }
        
    }
    static void createData(){
        try {
            FileWriter writer=new FileWriter("my.java");
            writer.write("Java is best coding lanuage ");
            writer.close();
        } catch (Exception e){
            System.out.println(e);

        }
    }
    
}
