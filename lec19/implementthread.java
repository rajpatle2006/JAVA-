package lec19;
class myThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
          System.out.println(i);
        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }
    }
}
public class implementthread  {
    public static void main(String[] args) {
        myThread obj =new myThread();
        Thread obj1=new Thread(obj);
        Thread obj2=new Thread(obj);
             obj1.start();
             obj2.start();
    }
    
}
