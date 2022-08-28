package Trab1;

public class Questao1 {

    public static void main(String[] args) {
        int tn = 10;

        for (int i = 0; i < tn; i++) {
            
            new ThreadMonstra("String", i).start();
           
        }
        

    }

    
    
}
