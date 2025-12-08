package Lec15;

import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class Myiterator2 {
    public static void main(String[] args) {
          ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator<Integer> it=list.listIterator();
        while (it.hasNext()) {
            Integer x=it.next();
            System.out.println(x);

            
        }
        while (it.hasPrevious()){
            Integer Y=it.previous();
            System.out.println(Y);
        }
    }
}
