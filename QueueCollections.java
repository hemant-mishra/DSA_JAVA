import java.util.*;
class QueueCollection{
    public static void main(String args[])
    {
        Queue<Integer> Q=new LinkedList<>();
        Q.add(9);
        Q.add(2);
        Q.add(3);
        Q.add(5);
        Q.add(6);

        Q.remove();
        Q.peek();
        System.out.println(Q);
    }
}