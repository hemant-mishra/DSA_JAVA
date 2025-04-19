import java.util.*;
public class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap(){
        heap=new ArrayList<>();
    }

    public void insert(int val){
        heap.add(val);
        heapify(heap.size()-1);
    }

    public void print(){
        System.out.println(heap);
    }

    public boolean empty(){
        return heap.size()==0;
    }

    public void heapify(int index){
        int parent=(index-1)/2;
        while(index>0 && heap.get(index)>heap.get(parent)){
            int temp=heap.get(index);
            heap.set(index,heap.get(parent));
            heap.set(parent,temp);

            index=parent;
            parent=(index-1)/2;
        }
    }

    public int deleteMax(){
        if (heap.isEmpty()){
            return -1;
        }
        if(heap.size()==1){
            return heap.remove(0);
        }

        int max=heap.get(0);
        heap.set(0,heap.remove(heap.size()-1));
        heapifyDown(0);

        return max;
    }

    public void heapifyDown(int inx){
        int size=heap.size();
        while(true){
            int left=2*inx+1;
            int right=2*inx+2;
            int largest=inx;

            if(left<size && heap.get(left)>heap.get(largest)){
                largest=left;
            }
            if(right<size && heap.get(right)>heap.get(largest)){
                largest=right;
            }
            if(largest==inx){
                break;
            }
            int temp=heap.get(inx);
            heap.set(inx,heap.get(largest));
            heap.set(largest,temp);
            inx=largest;
        }
    }
    public static void main(String args[]){
        MaxHeap heapmax=new MaxHeap();
        heapmax.insert(9);
        heapmax.insert(7);
        heapmax.insert(10);
        heapmax.insert(5);
        heapmax.insert(3);
        heapmax.insert(4);
        heapmax.print();
        //heapmax.deleteMax();
        heapmax.print();
        while(!heapmax.empty()){
            int item=heapmax.deleteMax();
            System.out.print(item+" ");

        }



    }
}
