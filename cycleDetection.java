import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class cycleDetection {

    public static boolean hasCycle(Node head) {
        HashMap<Node,Boolean> hm=new HashMap<>();
        Node current=head;
        while(current!=null){
            if(hm.containsKey(current)){
                return true;
            }
            hm.put(current,true);
            current=current.next;
        }
        return false;    
    }

    public static void main(String args[]) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head.next.next.next.next.next.next = head.next.next; 

        // Check for cycle
        if (hasCycle(head)) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
