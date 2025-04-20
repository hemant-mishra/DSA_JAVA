import java.util.*;

class MinStack{
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack(){
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void add(int val){
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
        minStack.push(minStack.pop());
    }
    public int min(){
        if(!stack.isEmpty()){
            return minStack.peek();
        }
        else{
            return -1; 
        }
        
    }
    public int peek(){
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return minStack.peek();
    }
}

class min{
    public static void main(String args[]){
        MinStack mn=new MinStack();
        mn.add(9);
        mn.add(5);
        mn.add(6);
        mn.add(4);
        System.out.println(mn.min());
    }
}