public class Matrix_Multiplication {
    public static int[][] multiplication(int[][] mat, int[][] tam){
        int[][] mul=new int[mat.length][tam[0].length];
        
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<tam[0].length;j++){
                int s=0;
                for(int k=0;k<mat[0].length;k++){
                 s=s + mat[i][k]*tam[k][j];
                }
                mul[i][j]=s;
            }
        }
        return mul;
    }

    public static void print(int[][] matrix){
        for(int[] num:matrix){
            for(int n:num){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] mat=new int[3][3];

        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                mat[i][j]=(int)(Math.random()*10);
            }
        }
        print(mat);
        int[][] tam=new int[3][3];

        for (int i=0;i<tam.length;i++){
            for(int j=0;j<tam.length;j++){
                tam[i][j]=(int)(Math.random()*10);
            }
        }

        print(tam);
        int[][] result=multiplication(mat,tam);
        print(result);
    }
    
}
