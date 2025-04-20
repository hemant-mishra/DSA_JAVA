import java.util.*;
public class NSE {
    public static void main(String args[]){
        int[] arr={31,12,45,65,45,43,23,67,76,87,78}; 
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){
            while(!st.empty() && arr[i]<st.peek() ){
                st.pop();
            }
            if(st.empty()){
                nse[i]=-1;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(arr[i]);
        }

        for(int n:nse){
            System.out.print(n+" ->");
        }
    }
    
}
