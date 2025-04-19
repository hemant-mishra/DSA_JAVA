public class selectionSort {
    public static void main(String args[]){
        
        int[] array={4,5,3,6,2,7,1};

        for (int i=0;i<array.length-1;i++){
            int min_value=i;
            for (int j=i;j<array.length;j++){
                if (array[min_value]>array[j]){
                    min_value=j;
                }
                int temp=array[min_value];
                array[min_value]=array[i];
                array[i]=temp;
            }
        }
        System.out.println();
        for(int n:array){
            System.out.print(n+" ");
        }
    }
}
