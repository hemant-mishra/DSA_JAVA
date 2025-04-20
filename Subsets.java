import java.util.*;
public class Subsets {


    public static void printSubsets(int[] arr, ArrayList<Integer> ans,int i){
        if(i==arr.length){
            for(int n:ans){
                System.out.print(n+" ");
            }
            System.out.println();
            return;
        }
        ans.add(arr[i]);
        printSubsets(arr,ans,i+1);
        ans.remove(ans.size()-1);
        printSubsets(arr,ans,i+1);
    } 
    public static void main(String args[]){
        int[] arr={1,2,3};
        printSubsets(arr,new ArrayList<>(),0);
    }
}