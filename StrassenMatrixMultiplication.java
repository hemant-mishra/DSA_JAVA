import java.util.Scanner;

public class StrassenMatrixMultiplication {
    
    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        
        if (n == 1) {
            C[0][0] = A[0][0] * B[0][0];
        } else {
            int newSize = n / 2;
            
            int[][] A11 = new int[newSize][newSize];
            int[][] A12 = new int[newSize][newSize];
            int[][] A21 = new int[newSize][newSize];
            int[][] A22 = new int[newSize][newSize];
            int[][] B11 = new int[newSize][newSize];
            int[][] B12 = new int[newSize][newSize];
            int[][] B21 = new int[newSize][newSize];
            int[][] B22 = new int[newSize][newSize];
            
            splitMatrix(A, A11, 0, 0);
            splitMatrix(A, A12, 0, newSize);
            splitMatrix(A, A21, newSize, 0);
            splitMatrix(A, A22, newSize, newSize);
            splitMatrix(B, B11, 0, 0);
            splitMatrix(B, B12, 0, newSize);
            splitMatrix(B, B21, newSize, 0);
            splitMatrix(B, B22, newSize, newSize);
            
            int[][] M1 = multiply(add(A11, A22), add(B11, B22));
            int[][] M2 = multiply(add(A21, A22), B11);
            int[][] M3 = multiply(A11, subtract(B12, B22));
            int[][] M4 = multiply(A22, subtract(B21, B11));
            int[][] M5 = multiply(add(A11, A12), B22);
            int[][] M6 = multiply(subtract(A21, A11), add(B11, B12));
            int[][] M7 = multiply(subtract(A12, A22), add(B21, B22));
            
            int[][] C11 = add(subtract(add(M1, M4), M5), M7);
            int[][] C12 = add(M3, M5);
            int[][] C21 = add(M2, M4);
            int[][] C22 = add(subtract(add(M1, M3), M2), M6);
            
            joinMatrix(C11, C, 0, 0);
            joinMatrix(C12, C, 0, newSize);
            joinMatrix(C21, C, newSize, 0);
            joinMatrix(C22, C, newSize, newSize);
        }
        return C;
    }

    private static void splitMatrix(int[][] parent, int[][] child, int row, int col) {
        for (int i = 0; i < child.length; i++) {
            for (int j = 0; j < child.length; j++) {
                child[i][j] = parent[i + row][j + col];
            }
        }
    }

    private static void joinMatrix(int[][] child, int[][] parent, int row, int col) {
        for (int i = 0; i < child.length; i++) {
            for (int j = 0; j < child.length; j++) {
                parent[i + row][j + col] = child[i][j];
            }
        }
    }

    private static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    private static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size (power of 2):");
        int n = scanner.nextInt();
        
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Matrix A:");
        printMatrix(A);
        
        System.out.println("Matrix B:");
        printMatrix(B);
        
        int[][] C = multiply(A, B);
        
        System.out.println("Resultant Matrix C:");
        printMatrix(C);
        
        scanner.close();
    }
}
