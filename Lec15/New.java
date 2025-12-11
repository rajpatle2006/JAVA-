package Lec15;

import java.util.ArrayList;
import java.util.ListIterator;

public class New {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5 );
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int t=8;
        ListIterator<Integer> it=list.listIterator();
        while (it.hasNext()) {
            Integer a= it.next();
            if(a==t){
                break;

            }
        }
        while(it.hasPrevious()){
            Integer Y=it.previous();
            if(Y<t){
                it.remove();
            }

        }
        System.out.println("final list: " + list);
    }
}
