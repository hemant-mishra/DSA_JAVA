import java.util.*;
public class sumEqualK {
    public static void main(String args[]){
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 8, 9};
        int count = 0;
        int k = 14;

        // for (int i = 0; i < arr.length; i++) {
        //     int current = 0;
        //     for (int j = i; j < arr.length; j++) {
        //         current += arr[j];  // Correctly accumulate the sum
        //         if (current == k) {
        //             count += 1;
        //             System.out.print("Subarray " + count + ": ");
        //             for (int n = i; n <= j; n++) {
        //                 System.out.print(arr[n] + " ");
        //             }
        //             System.out.println();
        //         }
        //     }
        // }
        // System.out.println("Total count of subarrays with sum equal to " + k + " is " + count);
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        
        HashMap<Integer, Integer> m= new HashMap<>();
        for(int j=0;j<arr.length;j++){
            if (arr[j] == k) {
                count++;
            }

            // Check if (arr[j] - k) exists in the map
            if (m.containsKey(arr[j] - k)){
                count += m.get(arr[j] - k);
            }

            // Update the map with the current prefix sum
            m.put(arr[j], m.getOrDefault(arr[j], 0) + 1);
        }

        System.out.println("Total count of subarrays with sum equal to " + k + " is " + count);
    }
}