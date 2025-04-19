public class bubbleSort {
    public static void main(String args[]){
        int[] array={6,5,7,4,8,3};

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
        for(int n:array){
            System.out.print(n+" ");
        }
    }
    
}
