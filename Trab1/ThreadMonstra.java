package Trab1;

public class ThreadMonstra extends Thread {

    String phrase;
    int tn;
    
    public ThreadMonstra(String phrase, int tn) {
        this.phrase = phrase;
        this.tn = tn;
    }
    
    public void run() {
     while(true){
             System.out.println(phrase + tn); 
         }
    }
}
