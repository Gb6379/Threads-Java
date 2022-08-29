package Trab5;

public class Questao5 {
    
   public static void main(String[] args) {

    try {
        while(true) {
            ThreadRun tRun = new ThreadRun();
            
           if(Thread.activeCount() < 10) {

            tRun.start();
            
           }
           
        }
    } catch (Exception e) {
        //TODO: handle exception
    }
   
   }
}
