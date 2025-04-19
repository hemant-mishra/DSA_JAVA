import java.util.*;
public class Union2Array {
    public static void main(String args[]){
    int[] arr1={7,3,9};
    int[] arr2={6,3,9,2,9,4};
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        hs.add(arr1[i]);
    }
    for(int j=0;j<arr2.length;j++){
        hs.add(arr2[j]);
    }
    System.out.println(hs);
    System.out.println(hs.size());
}
}
