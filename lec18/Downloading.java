package lec18;//code360
//naukari

class MyThread extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
          System.out.println("Download file....."+(i*20)+("%"));
        }
        try {
            Thread.sleep(4000);
        }catch (Exception e){
        }
    }
}
public class Downloading{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread obj=new MyThread();
        obj.start();
        try {
            obj.join();
        }catch (Exception e){
    
        }
        for(int i=0;i<5;i++){
           System.out.println(i + "  Timer ");
        }
         try {
           Thread.sleep(2000);
        }catch (Exception e){
    
        }

    }
    
}
    

