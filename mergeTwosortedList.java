import java.util.*;
public class mergeTwosortedList {
    public static void main(String args[]){
        List<Integer> L1=new ArrayList<>();
        List<Integer> L2=new ArrayList<>();
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add(5);
        L2.add(6);
        L2.add(7);
        L2.add(8);
        L2.add(9);

        List<Integer> mergeList=new ArrayList<>();
        int idx1=0;
        int idx2=0;

        while(idx1<L1.size() && idx2<L2.size()){
            if(L1.get(idx1)<=L2.get(idx2)){
                mergeList.add(L1.get(idx1++));
            }
            else{
                mergeList.add(L2.get(idx2++));
            }
        }
        while(idx1<L1.size()){
            mergeList.add(L1.get(idx1++));

        }
        while(idx2<L2.size()){
            mergeList.add(L2.get(idx2++));
        }

        System.out.println(mergeList);

    }
    
}
