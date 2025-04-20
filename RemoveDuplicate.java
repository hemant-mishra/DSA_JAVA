import java.util.*;
class Dup{
    public static void main(String args[]){
        int[] array1={1,2,3,5,4,5,6,5,4,3,2,1};
        List<Integer> l=new ArrayList<>();
        for(int item:array1){
            if(!l.contains(item)){
                l.add(item);
            }
        }
        System.out.println(l);
    }
}