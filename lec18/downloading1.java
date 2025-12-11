package lec18;


class MyThread extends Thread {
    public void run(){
         try {
            Thread.sleep(4000);
        }catch (Exception e){
        }
        for(int i=0;i<5;i++){
          System.out.println("Download file....."+(i*20)+("%"));
        }
       
    }
}
public class downloading1{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread obj=new MyThread();
        obj.start();
        try {
           // obj.join();
        }catch (Exception e){
    
        }  try {
           Thread.sleep(3000);
        }catch (Exception e){
    
        }
        for(int i=0;i<5;i++){
           System.out.println(i + "  my download ");
        }
       
        System.out.println(" file is downlladed");

    }
    
}
    

