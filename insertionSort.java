public class insertionSort {
    public static void main(String args[]){
        int[] array={2,3,1,4,7,5,6};

        for (int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;

            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }

        for(int n:array){
            System.out.print(n+" ");
        }
    }
    
}
