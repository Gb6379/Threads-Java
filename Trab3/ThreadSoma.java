package Trab3;

public class ThreadSoma extends Thread {


    int[][] matrix;

    public ThreadSoma(int[][] matrix) {
        this.matrix = matrix;
    }

    public void run() {//need to populate matrix
        

        for (int i = 0; i < matrix.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < matrix.length; j++) {
               
                sumRow = sumRow + matrix[i][j];  
            }
            System.out.println("Sum of " + (i+1) +" row: " + sumRow); 
        }
    }
    
}
