public class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addafter(String data, String data1){
        Node newNode=new Node(data);
        if (head!=null){
            Node curNode=head;
            while(curNode.data!=data1){
                curNode=curNode.next;
            }
            newNode.next=curNode.next;
            curNode.next=newNode;
        }
    }
    public void insertAT(int index,String data){
        if (index == 0) {
            addfirst(data);
            return;
        }
    
        int idx=0;
        Node newNode=new Node(data);
        Node curNode=head;
        while(curNode!=null & idx<index-1){
            idx +=1;
            curNode=curNode.next;
        }
        if (curNode == null) {
            System.out.println("Index out of bounds.");
            return;
        }
        newNode.next=curNode.next;
        curNode.next=newNode;
    }
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=head;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void deletefirst(){
        if (head!=null){
            head=head.next;
        }
        else{
            System.out.println("Linkedlist is empty");
        }
    }

    public void deleteLast(){
        if (head!=null){
            Node curNode=head;
            while(curNode.next.next!=null){
                curNode=curNode.next;
            }
            curNode.next=null;
        }
        else{
            System.out.println("Linked list is empty");
        }
    }

    public void deleteafter(String data1){
        if(head==null){
            System.out.println("list is empty");
        }
        else if(head.next==null){
            System.out.println("this operation is not possible as only one item is present");
        }
        else{
            Node curNode=head;
            while(curNode!=null){
                if(curNode.data==data1){
                    curNode.next=curNode.next.next;
                }
                curNode=curNode.next;
            }
        }
    }

    public void delethnth(int n) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        int len = 0;
        Node curNode = head;
        while (curNode != null) {
            len += 1;
            curNode = curNode.next;
        }

        if (n > len) {
            System.out.println("Invalid position.");
            return;
        }
        if (n == len) {
            head = head.next;
            return;
        }

        int desiredIndex = len - n;
        int i = 0;
        Node currNode = head;
        while (i < desiredIndex - 1) {
            currNode = currNode.next;
            i++;
        }
        currNode.next = currNode.next.next;
    }

    public void print(){
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print(currNode);
    }
    public void len(){
        Node curNode=head;
        int length=0;
        while(curNode!=null){
            length+=1;
            curNode=curNode.next;
        }
        System.out.println(length);
    }

    public void reverseLL(){
        if(head==null){
            return;
        }
        else if(head.next==null){
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

    public Node recurseRecursive(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node newNode=recurseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }

    public static void main(String args[]){
        LL linkedll=new LL();
        linkedll.addfirst("hemant");
        linkedll.addfirst("Mishra");
        linkedll.addlast("Singh");
        linkedll.addfirst("Sakshi");
        linkedll.addafter("love","Sakshi");
        linkedll.insertAT(2,"Priye");
        
        linkedll.print();
        // linkedll.deletefirst();
        // linkedll.deleteLast();
        linkedll.deleteafter("Sakshi");
        linkedll.delethnth(3);
        System.out.println();
        linkedll.print();
        System.out.println();
        linkedll.len();
        //linkedll.reverseLL();
        linkedll.head=linkedll.recurseRecursive(linkedll.head);
        linkedll.print();

        LL linked=new LL();
        linked.len();
        linked.head=linked.recurseRecursive(linked.head);
        linked.print();
        System.out.println();
        // linked.deletefirst();
        // linked.deleteLast();
    }
}
