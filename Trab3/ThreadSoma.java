package Trab3;

public class ThreadSoma extends Thread {


    int[][] matrix;
    int l;

    public ThreadSoma(int[][] matrix, int l) {
        this.matrix = matrix;
        this.l = l;
    }

    public void run() {//need to populate matrix
        
        System.out.println(matrix.length);
        for (int i = l; i <= l; i++) {
            int sumRow = 0;
            for (int j = 0; j < matrix.length; j++) {
               
                sumRow = sumRow + matrix[i][j];  
            }
            System.out.println("Sum of " + (i+1) +" row: " + sumRow); 
        }

    
    }
    
}
