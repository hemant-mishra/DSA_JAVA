import java.util.*;
public class PGE {
    public static void main(String args[]){
        int[] arr={31,12,45,65,45,43,23,67,76,87,78}; 
        Stack<Integer> st=new Stack<>();
        int[] pge=new int[arr.length];

        for (int i=0; i<arr.length;i++){
            while(!st.empty() && arr[i]>st.peek()){
                st.pop();
            }
             if(st.empty()){
                pge[i]=-1;
             }
             else{
                pge[i]=st.peek();
             }
             st.push(arr[i]);
        }

        for(int n:pge){
            System.out.print(n+"->");
        }
    }
    
}
