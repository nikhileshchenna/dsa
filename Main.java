import java.util.Scanner;

class Node{
  int data; //stores data
  Node next; //stores address
   
  //constructor
   public Node(int data){
      this.data=data;
      this.next=null;
   }
}

//class2 LL
class Link{
  Node head = null;
  Node tail = null;
   //method to insert ele's
   public void insert(int data){
       //creating a node...
       Node node = new Node(data);

       if(head==null){
        head=node;
        tail=node;

       }
       else{
          
       tail.next=node;
        tail=node;
      
        

       }
   }

   //method to print ele's

   public void print(){

       Node temp=head;
       while(temp!=null){
        System.out.print(temp.data+" ");
        
                 temp=temp.next;

             }
            
       }
             

            // System.out.println(head.next.next.next.data);
   }


   public class Main {
   
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       Link ll = new Link();
      System.out.print("enter no.of elements : ");
       int n= sc.nextInt();

       for(int i=0;i<n;i++){
          int val = sc.nextInt();
          ll.insert(val);

       }
       ll.print();
    }
   }

