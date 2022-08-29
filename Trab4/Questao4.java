package Trab4;
import javax.swing.JOptionPane;
import java.util.Random;

public class Questao4 {

    public static void main(String[] args){

        int threadsN = Integer.parseInt(JOptionPane.showInputDialog("Type threads number"));
        Random r = new Random();

        for (int i = 0; i < threadsN; i++) {

            ThreadCount t = new ThreadCount(r.nextInt(100000 ), r.nextInt(5000));
            t.start();
        }
        
    }
    
}
