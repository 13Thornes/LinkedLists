public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Create a linked List
    public Node createLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert into a linked list
    //0. if linked list doesn't exist then create it
    //1. Inserting at the begining
    //2. Inserting at the ending
    //3. Insert anywhere in the LL

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;

    }
    //Traverse a Linked List
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i !=size -1 ){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    //Search for a Node
    public boolean searchNode(int nodeValue) {
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.print(" Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println(" Node not found");
        return false;
    }

    //Deleting a Node from a single List
    public void deleteNode(int location) {
        // 0. if link doesn't exist
        if (head == null) {
            System.out.println("LinkedList does not exist");
            return;
        }
        // 1. if deleting at the beginning
        if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) { // if list only had one node
                tail = null; // get rid of the tail because list is now empty
            }
            System.out.println("Node head deleted");
            return;
        }
        // 2. if deleting at the ending
        if (location >= size - 1) {
            Node tempNode = head;
            while (tempNode.next != tail) { // finding the node before the tail
                tempNode = tempNode.next;
            }
            tempNode.next = null;  // delete the original tail node
            tail = tempNode;    // make the current node the new tail
            size--;
            System.out.println("Node tail deleted");
            return;
        }
        // 3. if deleting anywhere in the list
        Node tempNode = head;
        for (int i = 0; i < location - 1; i++) { // find the node before the one you want to delete
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next; // skip the node to delete it
        size--;
        System.out.println("Node deleted");
    }
}
