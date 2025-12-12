package lec19;
import java.util.List;
import java.util.ArrayList;

public class filterthelist {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        List<Integer> res=  list.stream().filter(n->n>60).toList();
        List<Integer> mapRes=  list.stream().map(n->n*2).toList();
        int data=  list.stream().reduce(0,(a,b)->a+b);
       // System.out.println(data);
       System.out.println(mapRes);


        
        
        
        
    
    }
}
