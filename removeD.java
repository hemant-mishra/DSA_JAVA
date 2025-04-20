import java.util.ArrayList;

public class removeD{
    public static void main(String[] args) {
        int[] array1 = {5, 5, 6, 6, 7, 8, 9, 9, 1};
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(array1[0]); // Add the first element
        for (int i = 1; i < array1.length; i++) {
            if (!list.get(list.size() - 1).equals(array1[i])) {
                list.add(array1[i]);
            }
        }
        
        for (int n : list) {
            System.out.print(n + " ");
        }
    }
}