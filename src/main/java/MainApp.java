public class MainApp {
    public static void main(String[] args) {
        LinkedList sda = new LinkedList();
        sda.insertInLinkedList(1, 0);
        sda.insertInLinkedList(2, 1);
        sda.insertInLinkedList(3, 2);
        sda.insertInLinkedList(4, 3);
        sda.insertInLinkedList(5, 4);
        sda.insertInLinkedList(6, 5);

        sda.traverseLinkedList();
        sda.searchNode(8);
        sda.deleteNode(1);
        sda.traverseLinkedList();

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertDLL(1,0);
        dll.insertDLL(2,1);
        dll.insertDLL(3,2);
        dll.insertDLL(4,3);

        dll.traverseDLL();

        dll.reverseTraverseDLL();

    }
}
