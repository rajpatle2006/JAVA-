public class largestsmalest{
    // public static void main(String[] args) {
        
    //     String str="hello java powerful";
    //     String a[]=str.split(" ");
    //     String largest="";
    //     for(String val:a ){
    //         if(val.length()>largest.length()){
    //             largest=val;
    //         }
    //     }
    //     System.out.println(+ largest);
 
    // }

    
    public static void main(String[] args) {
        String str = "hello java powerful language";
        String a[] = str.split(" ");
        
        String largest = a[0];
        String smallest = a[0];

        for (String val : a) {
            if (val.length() > largest.length()) {
                largest = val;
            }
            if (val.length() < smallest.length()) {
                smallest = val;
            }
        }

        // System.out.println("सबसे बड़ा शब्द है: " + largest);
        // System.out.println("सबसे छोटा शब्द है: " + smallest);
         System.out.println("largeword: " + largest);
         System.out.println("smallword: " + smallest);
    }
}

    

