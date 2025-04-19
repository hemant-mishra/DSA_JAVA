// impplementation using java collection frameWork
import java.util.*;
class stacks {
    public static void PushAtBootom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtBootom(data,s);
        s.push(top);

    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty())
        {
            return;
        }
        int item=s.pop();
        reverse(s);
        PushAtBootom(item,s);
    }

    public static void main(String args[]){

        Stack<Integer> stk=new Stack<Integer>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(6);
        PushAtBootom(9,stk);
        stk.pop();
        reverse(stk);
        while(!stk.isEmpty()){
            System.out.print(stk.peek()+" ");
            stk.pop();
        }
    }
}

public class STACK{
    public static class stks{
        ArrayList<Integer> arr=new ArrayList<Integer>();

        public void addfirst(int data){
            arr.add(data);
        }
        public int peek(){
            int top=arr.get(arr.size()-1);
            return top;
        }
        public void pop(){
            arr.remove(arr.size()-1);
        }
        public boolean is_empty(){
            return arr.size()==0;
        }
    } 
    public static void main(String args[]){
        stks aar1=new stks();
        aar1.addfirst(2);
        aar1.addfirst(3);
        aar1.addfirst(5);
        System.out.print(aar1.peek());
        System.out.println();
        while(!aar1.is_empty()){
            System.out.print(aar1.peek()+" ");
            aar1.pop();
        }
    }
}

class StackLL{
    Node head;
    public class Node{
        String Data;
        Node next;
        Node(String Data){
            this.Data=Data;
            this.next=null;
        }
    }
    public void LastIn(String Data){
        Node newNode=new Node(Data);
        if(head==null){
            head=newNode;
        }
        else{
        newNode.next=head;
        head=newNode;
        }
    }

    public String getTop(){
        String item=head.Data;
        return item;
    }

    public void firstOut(){
        if (head!=null){
            head=head.next;
        }
    }
    public boolean is_empty(){
        return head==null;
    }
    public void print(){
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.Data+" ");
            curNode=curNode.next;
        }
    }

    public static void main(String args[]){
        StackLL stp=new StackLL();
        stp.LastIn("IITian");
        stp.LastIn("Hemant");
        stp.LastIn("Mishra");
        stp.LastIn("IITian");
        System.out.println(stp.getTop());
        //stp.print();
        while(!stp.is_empty()){
            System.out.print(stp.getTop()+" ");
            stp.firstOut();
        }
        
    }
}