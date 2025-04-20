import java.util.*;
public class NGE {
    public static void main(String args[]){
        ArrayList<Integer> st=new ArrayList<>();
        ArrayList<Integer> sp=new ArrayList<>();
        st.add(6);
        st.add(0);
        st.add(8);
        st.add(1);
        st.add(3);

        // for(int i=0; i<st.size();i++){
        //     sp.add(-1);
        // }
        for(int i=0; i<st.size();i++){
            for(int j=i+1;j<st.size();j++){
                if(st.get(j)>st.get(i)){
                    sp.add(st.get(j));
                    break;
                }
                // else{
                //     sp.add(-1);
                // }
            }
        }

        System.out.println(sp);
    }
    
}
