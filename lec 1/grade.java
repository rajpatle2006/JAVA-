

class Grade {
   public static void main(String[]args){
       int mark=95;
//        int att=48;
       if(mark>90){
           System.out.println("Grade A");
       } else if (mark>80) {
           System.out.println("Grade B+");
       } else if (mark>70) {
           System.out.println("Grade B");
       } else if (mark>60) {
           System.out.println("Grade C+");

       } else if (mark>50) {
           System.out.println("Grade C");
       }
       else {
           System.out.println("Fail!!");
       }

   }
}
