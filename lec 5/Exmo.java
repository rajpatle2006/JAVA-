// package lec 5;
// import java.util;
public class Exmo  {
    public static void main(String[] args) {
        String str="i  love java";
        String a[]=str.split(" ");
        StringBuilder result=new StringBuilder();



    for(String ele : a){
            StringBuilder val=new StringBuilder(ele);
            result.append(val.reverse()).append(" ");
        } 
        System.out.println(result);

    }
    
}

    

