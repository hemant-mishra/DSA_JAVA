import java.util.*;

public class NGEStack {
    public static void main(String args[]){
        int[] arr={31,12,45,65,45,43,23,67,76,87,78}; 
        Stack<Integer> s=new Stack<>();
        int[] nge=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && arr[i]>s.peek()){
                s.pop();
            }
            if(s.empty()){
                nge[i]=-1;
            }
            else{
                nge[i]=s.peek();
            }
            s.push(arr[i]);
        }
        
        for(int n:nge){
            System.out.print(n+"->");
        }
    }

    
}
