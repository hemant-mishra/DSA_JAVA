import java.util.*;
public class SubString {
    public static void main(String args[]){
        String s="abcdabcbb";
        int start=0;
        int end=0;
        int max_length=0;

        List<Character> l=new ArrayList<>();

        while(end<s.length()){
            if(!l.contains(s.charAt(end))){
                l.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,l.size());
            }
            else{
                l.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.println(max_length);
    }
}
