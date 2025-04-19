public class QueueLL {
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class DemoL{
        static Node head;
        static Node tail;

        public boolean isEmpty(){
            return head==null && tail==null;
        }

        public void add(int data){
             Node newNode=new Node(data);
            if(isEmpty()){
                head=tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            


        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front=head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
        public void print(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            Node curNode=head;
            while(curNode!=null){
                System.out.print(curNode.data+" -> ");
                curNode=curNode.next;                
            }
            System.out.println("null");
        }
    }

        public static void main(String args[]){
            DemoL demo=new DemoL();
            demo.add(9);
            demo.add(8);
            demo.add(7);
            demo.add(6);
            demo.add(5);

            System.out.println(demo.peek());
            demo.remove();
            demo.print();
        }

}
