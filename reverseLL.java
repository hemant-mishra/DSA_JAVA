public class reverseLL {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void reverse(){
        if(head==null){
            System.out.print("null");
            return;
        }
        else if(head.next==null){
            System.out.print(head.data);
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public int length(){
        Node currNode=head;
        int len=0;
        if(head==null){
            return 0;
        }
        while(currNode!=null){
            len+=1;
            currNode=currNode.next;
        }
        return len;
    }

    public static void removeNthEnd(reverseLL p,int n){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            else if(n==p.length()){
                head=head.next;
                return;
            }
            int kStart=p.length()-n;
            int count=0;
            Node currNode=head;
            while (count<kStart-1){
                currNode=currNode.next;
                count++;
            }
            currNode.next=currNode.next.next;
        }
    
        public void print(){
            Node currNode=head;
            while (currNode!=null){
                System.out.print(currNode.data+" ");
                currNode=currNode.next;
            }
        }
        public static void main(String args[]){
            reverseLL LL=new reverseLL();
            LL.addfirst(3);
            LL.addfirst(4);
            LL.addLast(5);
            LL.addLast(9);
            LL.reverse();
            System.out.println(LL.length());
            LL.print();
            removeNthEnd(LL,2);
            System.out.println();
            LL.print();

    }
    
}
