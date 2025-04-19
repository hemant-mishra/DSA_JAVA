import java.util.*;
public class Hashing {
    public static void main(String args[]){
        // Creation
        // HashSet<Integer> set=new LinkedHashSet<>(); return data in the way you have entered
        
        HashSet<Integer> set=new HashSet<>();

        //Insertion
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(6);
        set.add(5);

        // Searching
        if(set.contains(5)){
            System.out.println("your set contain the given item");
        }
        if(!set.contains(6)){
            System.out.println("does nnot contains the given item");
        }

        // Delete
        set.remove(1); 
        if(!set.contains(1)){
            System.out.println("Either you deleted or you did not had 1 in your set");
        }
        System.out.println("Size of the set is "+set.size());
        System.out.println(set);

        // iterator
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"->");
        }

         

    }
    
}
