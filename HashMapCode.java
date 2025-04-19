import java.util.*;
class HashMapCode{
    static class HashMap<k,v>{
        private class Node{
        k key;
        v value;
        public Node(k key,v value){
            this.key=key;
            this.value=value;
        }
    }

    private int n;
    private int N;
    private LinkedList<Node> bucket[];

    public HashMap(){
        this.N=4;
        this.bucket=new LinkedList[4];
        for(int i=0;i<4;i++){
            this.bucket[i]=new LinkedList<>();
        }
    }

    private int Hashfunction(k key){
        int bi=key.hashCode();
        return Math.abs(bi)%N;

    }

    private int SearchLL(k key,int bi){
        LinkedList<Node> ll=bucket[bi];
        for(int i=0;i<ll.size();i++){
            if(ll.get(i).key==key){
                return i;
            }
        }
        return -1;
    }

    private void rehash(){
        LinkedList<Node> oldBucket[]=bucket;
        bucket=new LinkedList[N*2];

        for(int i=0;i<bucket.length;i++){
            bucket[i]=new LinkedList<>();
        }

        for(int i=0;i<oldBucket.length;i++){
            LinkedList<Node> ll=oldBucket[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.get(j);
                put(node.key,node.value);
            }
        }


    }

    public void put(k key,v value){
        int bi=Hashfunction(key);
        int di=SearchLL(key,bi);

        if(di==-1){
            bucket[bi].add(new Node(key,value));
            n++;
        }
        else{
            Node data=bucket[bi].get(di);
            data.value=value;
        }
        double lambda=(double)n/N;
        if(lambda>2){
            // rehashing
            rehash();
        }

    }

    public v get(k key){
        int bi=Hashfunction(key);
        int di=SearchLL(key,bi);

        if(di==-1){
            return null;
        }
        else{
            Node data=bucket[bi].get(di);
            return data.value;
        }
    }

    public void remove(k key){
        int bi=Hashfunction(key);
        int di=SearchLL(key,bi);
        if (di==-1){
            System.out.println("Key does not exist");
        }
        else{
            Node node=bucket[bi].remove(di);
            n--;
        }
    }

    public boolean isEmpty(){
        return n==0;
    }

    public ArrayList<k> keySet(){
        ArrayList<k> keys=new ArrayList<>();

        for(int i=0;i<bucket.length;i++){
            LinkedList<Node> ll=bucket[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.get(j);
                keys.add(node.key);            
            }
        }
        return keys;
    }
    public static void main(String args[]){
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("india",2000);
        hm.put("usa",1000);

        ArrayList<String> keys=hm.keySet();
        System.out.println(keys);

    }
}
}