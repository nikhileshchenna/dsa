import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
   public Node(int data){
    this.data = data;
   }
}

public class best {
    public static  Node insert(Node root,int val){
       if(root==null){
        return new Node(val);
       }
       else if(val<root.data){
        root.left = insert(root.left,val);
       }
       else if(val>root.data){
        root.right = insert(root.right,val);
        }
        return root;
       }
    
    public static void print( Node root){
        if(root==null){
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }
    


  
    public static void main(String[] args) {
    int n = 5;
    int arr[]  ={50 ,30, 70, 20, 40};
    Node root = null;
    for(int i=0;i<n;i++){
    root = insert(root,arr[i]);
    }        
     print(root);
    }
}

