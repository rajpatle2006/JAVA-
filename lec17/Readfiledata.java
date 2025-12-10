package lec17;

import java.io.FileReader;

public class Readfiledata {
    public static void main(String[] args) {
        readFileData();

        
    }
    static void readFileData(){
        try{
        FileReader reader=new FileReader("my.java");
        int ch;
        while   ( (ch=reader.read())!=-1){
            System.out.print((char)ch);


        }
    }catch(Exception e){
        System.out.println(e);
    }
}
}
