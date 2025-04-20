// example of sliding window
public class maxSum {
    public static void main(String args[]){
        int[] array={13,8,2,50,7,6,12};
        int w=3;
        int current=0;
        for(int i=0;i<w;i++){
            current +=array[i];
        }
        int max=current;
        for(int i=1;i<=array.length-w;i++){
            current=current-array[i-1]+array[i+w-1];
            if(max<current){
                max=current;
            }
        }
        System.out.println(max);
        
    }
    
}
