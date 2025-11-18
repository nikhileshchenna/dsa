
import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        
    }
}
class LinkedList{
    Node head;
    Node tail;
    public void insert(int data){
        Node n = new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            // tail.next=n;
            // tail=n;
            n.next=head;
            head=n;
        }

    }
    public void print(){
    
        Node temp = head;

        while(temp!=null) {
            System.out.println(temp.data+" ");
            temp=temp.next;
            
        }

    }

}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
   LinkedList ll = new LinkedList();
    for(int i=0;i<n;i++){
       int ele = sc.nextInt();

       ll.insert(ele);


    }

    ll.print();
    sc.close();
  }
    
}