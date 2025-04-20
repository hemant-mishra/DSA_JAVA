import java.util.*;
public class PSE {
    public static void main(String args[]){
        int[] arr={31,12,45,65,45,43,23,67,76,87,78};
        Stack<Integer> st=new Stack<>();
        int[] pse=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!st.empty() && arr[i]<st.peek()){
                st.pop();
            }
            if(st.empty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(arr[i]);
        }

        for(int n:pse){
            System.out.print(n+" ->");
        }
    }
    
}
