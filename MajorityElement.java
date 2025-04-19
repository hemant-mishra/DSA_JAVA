import java.util.*;
public class MajorityElement {
    public static void main(String args[]){
        int arr[]={1,2};
        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> e:hm.entrySet()){
            if(e.getValue()>arr.length/3){
                System.out.println(e.getKey()+"->"+e.getValue());
            }
        }


    }

    
}
