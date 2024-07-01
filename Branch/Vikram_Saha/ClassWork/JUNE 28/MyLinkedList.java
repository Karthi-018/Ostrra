// import java.util.*;
public class MyLinkedList {

    Node head;

    public MyLinkedList() {
        this.head = null;
    }

    void append(int data){
        Node temp=new Node(data,null);
        if(head ==null) head=temp;
        else{
            Node curr=head;
            while(curr.next !=null) curr=curr.next;
            curr.next=temp;
        }
    }
    void insertAtHead(int data){
        Node temp=new Node(data,null);
        if(head ==null) head=temp;
        else{
            temp.next=head;
            head=temp;
        }
    }
    void insertAt(int data,int index){
        Node temp=new Node(data,null);
        Node curr=head;
        if(index<=0) {insertAtHead(data); return;}
        for(int i=0;i<index;i++){
            if(curr== null) {
                System.out.println("out of bounds inserting at last");
                append(data);
                return;
            }
            curr=curr.next;
        }
        Node iNext=curr.next;
        curr.next=temp;
        temp.next=iNext;
    }
    void print(){
        Node curr=head;
        while(curr!=null) {System.out.println(curr.data); curr=curr.next;}
        
    }

    void removeAt(int index){
        Node curr=head;
        Node prev=null;
        if(index==0){
            head=head.next;
            return;
        }
        for(int i=0;i<index;i++){
            if(curr== null) {
                System.out.println("out of bounds");
                
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        // Node iNext=curr.next;
        if(curr.next==null) {prev.next=null; return;}
        prev.next=curr.next;
       
    }
}
