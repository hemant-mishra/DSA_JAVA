import java.util.*;
public class Mapping {
    public static void main(String args[]){
        HashMap<String, Integer> hm=new HashMap<>();
    
        // Insertion
        hm.put("Apples",200);
        hm.put("Banana",60);
        hm.put("Grapes",80);
        hm.put("Guvava",40);
        hm.put("WaterMalon",50);

        System.out.println(hm);
        hm.put("Apples",300);  // if key exist value will be updated otherwise new ey value pair will be created.
        System.out.println(hm);

        // Searching 

        if(hm.containsKey("Apples")){
            System.out.println(hm.get("Apples"));
        }
        else{
            System.out.println("key does not exist");
        }

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.print(e.getKey() + "->" + e.getValue()+" ,");
            //System.out.println(); // Moves to the next line
        }

        System.out.println();
        // deletion
        hm.remove("Apples");
        Set<String> keys= hm.keySet();
        for(String key:keys){
            System.out.print(key+":"+hm.get(key)+" ,");
        }


    }
    
}
