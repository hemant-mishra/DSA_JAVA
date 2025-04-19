import java.util.*;

public class Stack2Queue {
    static class que{
        static Stack<Integer> S1=new Stack<>();
        static Stack<Integer> S2=new Stack<>();
                        
        public  boolean isEmpty(){
            return S1.isEmpty() && S2.isEmpty();
        }

        public  void add(int data){
            while(!S1.isEmpty()){
                S2.push(S1.pop());
            }
            S1.add(data);
            while(!S2.isEmpty()){
                S1.push(S2.pop());
            }
        }

        public int remove(){
            if(S1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return S1.pop();
        }

        public int peek(){
            if(S1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return S1.peek();

        }
    }
    public static void main(String args[]){
        que q=new que();
        q.add(4);
        q.add(3);
        q.add(9);
        q.add(6);
        q.add(7);

        System.out.println();
        System.out.println(q.remove());
        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.print(q.peek()+" -> ");
            q.remove();
        }
    }   
}
