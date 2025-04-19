import java.util.*;
public class Tree{
    static class Node{
        int Data;
        Node left;
        Node right;

        Node(int Data){
            this.Data=Data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }

        public void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.Data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.Data+" ");
            inOrder(root.right);
        }

        public void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.Data+" ");
        }

        public void LevelOrderTraversal(Node root){
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode=q.remove();
                if (currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.Data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right !=null){
                        q.add(currNode.right);
                    }
                }
            }

        }
        public int countNodes(Node root){
            if (root==null){
                return 0;
            }
            int leftNodes= countNodes(root.left);
            int rightNodes=countNodes(root.right);
            return leftNodes+ rightNodes+1;
        }

        public int sumNodes(Node root){
            if (root==null){
                return 0;
            }
            int leftNodes= sumNodes(root.left);
            int rightNodes= sumNodes(root.right);
            return leftNodes+ rightNodes+ root.Data;
        }

        public int height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            int maxHeight=Math.max(leftHeight,rightHeight) +1;
            return maxHeight;
        }
        public int diameter(Node root){
            if (root==null){
                return 0;
            }
            int diameter1=diameter(root.left);
            int diameter2=diameter(root.right);
            int diameter3=height(root.left)+height(root.right)+1;

            return Math.max(diameter3,Math.max(diameter2,diameter1));
        }

        static class Treeinfo{
            int height;
            int diameter;

            Treeinfo(int height, int diameter){
                this.height=height;
                this.diameter=diameter;
            }
        }

        public Treeinfo twDiameter(Node root){
            if (root==null){
                return new Treeinfo(0,0);
            }
            Treeinfo left=twDiameter(root.left);
            Treeinfo right=twDiameter(root.right);
            int myheight=Math.max(left.height,right.height)+1;

            int dia1=left.diameter;
            int dia2=right.diameter;
            int dia3=left.height+right.height+1;

            int finalDia=Math.max(Math.max(dia1,dia2),dia3);

            return new Treeinfo(myheight,finalDia);
        }
    }
        // public static int countNodes(Node root){
        //     if (root==null){
        //         return 0;
        //     }
        //     int leftNodes= countNodes(root.left);
        //     int rightNodes=countNodes(root.right);
        //     return leftNodes+ rightNodes+1;
        // }

        public static void main(String args[]){
            int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree bt=new BinaryTree();
            Node root=bt.BuildTree(nodes);
            System.out.println(root.Data);
            bt.preorder(root);
            System.out.println();
            bt.inOrder(root);
            System.out.println();
            bt.postOrder(root);
            System.out.println();
            bt.LevelOrderTraversal(root);
            System.out.println(bt.countNodes(root));
            System.out.println(bt.sumNodes(root));
            System.out.println(bt.height(root));
            System.out.println(bt.diameter(root));
            System.out.println(bt.twDiameter(root).diameter);

        }
    }  