import java.util.Scanner;

class Main {
    static boolean findSaddlePoint(int mat[][], int n) {
        for (int i = 0; i < n; i++) {
            int min_row = mat[i][0], col_ind = 0;
            for (int j = 1; j < n; j++) {
                if (min_row > mat[i][j]) {
                    min_row = mat[i][j];
                    col_ind = j;
                }
            }
      
            int k;
            for (k = 0; k < n; k++) {
                if (min_row < mat[k][col_ind]) {
                    break;
                }
            }
      
            if (k == n) {
                System.out.println("Saddle Point: (" + i + ", " + col_ind + "), Value: " + min_row);
                return true;
            }
        }
      
        return false;
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[][] mat = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        
        if (!findSaddlePoint(mat, n)) {
            System.out.println("No Saddle Point");
        }
        
        scanner.close();
    }
}