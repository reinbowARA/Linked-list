/*
 * MyList
 */
public class MyList {
    private Node head = new Node() ;
    private int length = 0;

    public class Node{
        int data;
        Node next = null;
        public Node (int data){
            this.data = data;
        }
        public Node(){}
    }

    public void add(int data) { 
        Node newNode = new Node(data);
        //Node currentNode = head;

        if (head.next != null) {
            newNode.next = head.next;
        }
        head.next=newNode;
        /*if (head == null) {
            head = newNode;
        } 
        else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }*/
    }

    public void endadd(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public boolean delete(Node delnode) {
        if (delnode == null || delnode.next == null) {
            return false;
        }
        delnode = delnode.next;
        return true;
    }
    
    public void remove(int data) {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.next != null){
            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                }
                else {
                    previousNode.next = currentNode.next;
                }
            }  
            
            previousNode = currentNode;
            currentNode = currentNode.next;

        }
    }

    public void print(){
        Node currentNode = head;
        /*if (head != null){
            System.out.println(head.data);
        }*/

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }
    public int getLenght() {
        Node walkPointer = head;
        while(walkPointer.next != null)
        {
            walkPointer = walkPointer.next;
            length++;
        }
        return length;
    }
}