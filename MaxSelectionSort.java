public class MaxSelectionSort {
    public static void main(String args[]){
        int[] array={2,3,1,4,7,5,6};

        int temp;
        int max_value;
        for (int i = 0; i < array.length - 1; i++) {
            max_value = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[max_value] < array[j]) {
                    max_value = j;
                }
            }
            temp = array[i];
            array[i] = array[max_value];
            array[max_value] = temp;
        }

        System.out.println();
        for(int n:array){
            System.out.print(n+" ");
        }
    }
    
}


