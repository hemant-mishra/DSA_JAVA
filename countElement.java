import java.util.*;
public class countElement {
    public static void main(String args[]){
        int[] arr={1,4,5,9,7,4,1,4,4,7,7};
        HashMap<Integer,Integer> hm=new HashMap<>();

        for (int i=0; i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm);

        for(Map.Entry entry:hm.entrySet()){
            System.out.println("key    |    value");
            System.out.println(entry.getKey()+"         "+entry.getValue());
        }
    }
    
}
