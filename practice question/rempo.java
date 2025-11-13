// // package practice question;
// import java.util.Scanner;
// public class SumArray {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int sum = 0;

//        System.out.println("Enter elements:");
//        for (int i = 0; i < n; i++) {
//           arr[i] = sc.nextInt();
//           sum += arr[i];
//         }
//         System.out.println("Sum = " + sum);
//      } 
      

// }


 import java.util.Scanner;

// public class SumArray{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         if (n <= 0) {
//             System.out.println("Array size must be positive.");
            
//         }

//         int[] arr = new int[n];
//         int sum = 0;

//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             sum += arr[i];
//         }

//         System.out.println("Sum = " + sum);
//         sc.close(); // Good practice
//     }


//         public class sum {
//     public static void main(String[] args) {
//         String str="hello";
//         int v=0;
//         for(char ch :str.toCharArray()){
//             if("aeuio".indexOf(ch)!=-1){
//                 v++;
            
//             }
//         }
//         System.out.println(v);
//     }
// }


//     public class examo {
//     public static void main(String[] args) {
//         String str="hello java powerful";
//         String a[]=str.split(" ");
//         String largest="";
//         for(String val:a ){
//             if(val.length()>largest.length()){
//                 largest=val;
//             }
//         }
 
//     }
// }

// public class examo {
//     public static void main(String[] args) {
//         String str = "hello java powerful language";
//         String a[] = str.split(" ");
        
//         String largest = a[0];
//         // String smallest = a[0];

//         for (String val : a) {
//             if (val.length() > largest.length()) {
//                 largest = val;
//             }
//             // if (val.length() < smallest.length()) {
//             //     smallest = val;
//             // }
//         }

//         // System.out.println("सबसे बड़ा शब्द है: " + largest);
// //         System.out.println("सबसे छोटा शब्द है: " + smallest);
//     }
// }
 


public class rempo {
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
