import java.util.*;
public class subarraySumK {
    public static void main(String args[]){
        int[] arr={10,2,-2,-20,10};
        int k=-10;
        int count=0;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];

        }

        HashMap<Integer, Integer> hm=new HashMap<>();
        
        for(int j=0;j<arr.length;j++){
            if(arr[j]==k){
                count++;
            }
        if(hm.containsKey(arr[j]-k)){
            count +=hm.get(arr[j]-k);
        }
        hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);
    }
    System.out.println("total no. of subarray sum equals" +k +"is"+count);
}
}
 