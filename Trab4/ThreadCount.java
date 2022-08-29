package Trab4;

public class ThreadCount extends Thread {

    int number;
    int sleepT;

    public ThreadCount(int number, int sleepT) {
        this.number = number;
        this.sleepT = sleepT;
    }

    public void run() {
        
        System.out.println("Number: " + number  +" Thread: " + Thread.currentThread().getId() + " Criada");

        try {

            for (int i = 0; i < number; i++) {
                System.out.println(i);
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " Entrando em espera");
        
                Thread.sleep(sleepT);
                System.out.println("Thread " + Thread.currentThread().getId() + " Saindo de espera");
                System.out.println(" Execução Thread " + Thread.currentThread().getId() + " finalaizada");
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
     
         
    
    }
    
}
