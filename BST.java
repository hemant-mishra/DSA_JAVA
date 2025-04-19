import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node insert(Node root, int val){
 
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }   
        return root;   
    }

    public static boolean search(Node root,int item){
        if(root==null){
            return false;
        }
        else if(root.data==item){
            return true;
        }
        else if(root.data>item){
            return search(root.left,item);
        }
        else{
            return search(root.right,item);
        }
    }

    public static int min(Node root){
        if(root==null){
            return root.data;
        }
        Node curr=root;
        while(curr.left!=null){
            curr=curr.left;
        }
        return curr.data;
    }

    public static int max(Node root){
        if(root==null){
            return root.data;
        }
        Node curr=root;
        while (curr.right!=null){
            curr=curr.right;
        }
        return curr.data;
    }
    public static Node delete(Node root, int data){
        if(root.data<data){
            root.right=delete(root.right,data);
        }
        else if(root.data>data){
            root.right=delete(root.left,data);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node is=inorderSuccessor(root.right);
                root.data=is.data;
                root.right=delete(root.right,is.data);
            }
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int x, int y){
        if(root==null){
            return;
        }
        else if(root.data>=x && root.data<=y){
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
            printInRange(root.right,x,y);
        }
        else if(root.data>=y){
            printInRange(root.left,x,y);
        }
        else{
            printInRange(root.right,x,y);
        }
    }

    public static void Print(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            Print(path);
        }
        else{
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);

    }
    public static void main(String args[]){
        Node root=null;
        int[] values={2,5,6,4,3,7,8,0,9};
        for (int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(search(root,1));
        System.out.println(min(root));
        System.out.println(max(root));
        delete(root,8);
        inorder(root);
        System.out.println();
        printInRange(root,6,9);
        System.out.println();
        printRoot2Leaf(root,new ArrayList<>());
    }
}
