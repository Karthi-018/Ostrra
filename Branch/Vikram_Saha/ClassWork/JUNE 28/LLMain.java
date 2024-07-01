public class LLMain {
public static void main(String[] args) {
    MyLinkedList head=new MyLinkedList();
    head.append(5);
    head.append(15);
    head.append(25);
    head.append(35);
    head.insertAtHead(1);
    head.insertAt(6, 2);
    head.removeAt( 3);
    head.print();
}
}
