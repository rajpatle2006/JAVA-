package lec3;

import java.util.Scanner;

public class stringrevse {
   public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         String str ="hello";{
    for(int i =str.length()-1;i>=0;i--){
        System.out.println(str.charAt(i));
    }
     
    }
    
     sc.close();
}   
}


