import java.util.*;
public class itiniery {

    public static String getStart(HashMap<String,String> hm){
        HashMap<String, String> revTicket=new HashMap<>();

        for(String key:hm.keySet()){
            revTicket.put(hm.get(key),key);
        }

        for(String key:hm.keySet()){
            if(!revTicket.containsKey(key)){
                return key;
            }
        }
        return null;

    }
    public static void main(String args[]){
        HashMap<String, String> ticket=new HashMap<>();
        ticket.put("Chennai","Benguluru");
        ticket.put("Mumbai","Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");

        String start=getStart(ticket);

        while(ticket.containsKey(start)){
            System.out.print(start+"->");
            start=ticket.get(start);
        }
        System.out.println(start);
    }   
}
