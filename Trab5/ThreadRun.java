package Trab5;

public class ThreadRun extends Thread {
    
    public void run() {
        try {
            System.out.println(" THREAD " + Thread.currentThread().getId());
            Thread.sleep(5000);
            System.out.println(" Number of threads running : " + Thread.activeCount());
        } catch (Exception e) {
            //TODO: handle exception
        }
        
       
    }
}
