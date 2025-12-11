package lec18;

    class MyThread extends Thread {
    public void run(){
        // System.out.println("hii sir");
        for(int i=0;i<5;i++){
           System.out.println(i + "  raunak");
            try { 
           Thread.sleep(3000);

        }catch (Exception e){
    
        }
    }
}
    }
public class sleepmethod {
        public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread obj=new MyThread();
        obj.start();
        try {
           obj.join();
          // Thread.sleep(2000);
        }catch (Exception e){
        }
        for(int i=0;i<5;i++){
           System.out.println(i + "  raj ");
        }

    }
    
}

    

