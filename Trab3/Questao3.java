package Trab3;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Questao3 {

    int linha;
    int coluna;
    int[][] matrix;

    public Questao3(int linha,int coluna,int[][] matrix) {
        this.linha = linha;
        this.coluna = coluna;
        this.matrix = new int[linha][coluna];
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
          
        int l = 3;//Integer.parseInt(JOptionPane.showInputDialog("Type size of line"));
        int c = 3;//Integer.parseInt(JOptionPane.showInputDialog("Type colun's size"));
        int[][] m = new int[0][0];
        Random r = new Random();

       
         Questao3 q3 = new Questao3(l,c,m);

       

         for (int i = 0; i < q3.matrix.length; i++) {
            for (int j = 0; j < q3.matrix.length; j++) {   
                q3.matrix[i][j] = r.nextInt(25); 
            }
        }
           

        for(int[] row : q3.matrix)
    
            System.out.println(Arrays.toString(row));

        
        
        ThreadSoma tSoma = new ThreadSoma(q3.matrix, 0);
        ThreadSoma tSoma2 = new ThreadSoma(q3.matrix, 1);
        ThreadSoma tSoma3 = new ThreadSoma(q3.matrix, 2);


        
        try {
            tSoma.start();
            tSoma.join();
            
            tSoma2.start();
            tSoma2.join();

            tSoma3.start();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
            
        
    }
}
