public class Queues {
    static class Queue{
        static int arr[];
        int size;
        static int rear=-1;
        static int front=-1;

        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public boolean isEmpty(){
            return rear==-1;
        }


        public boolean isFull(){
            return (rear+1)%size==front;
        }
        public void add1(int data){
            if(isFull()){
                System.out.println("full queue");
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public int remove1(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public int peek1(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }
            else{
                return arr[front];
            }
        }

        public void add(int data){
            if(rear==size-1){
                System.out.println("full enque");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front=arr[0];
            return front;
        }

        public void print(){
            for(int i=0;i<rear+1;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
        public static void main(String args[]){
            Queue q=new Queue(5);
            q.add(4);
            q.add(5);
            q.add(3);
            q.add(2);
            System.out.println(q.remove());
            System.out.println(q.peek());
            q.print();
        }
}
