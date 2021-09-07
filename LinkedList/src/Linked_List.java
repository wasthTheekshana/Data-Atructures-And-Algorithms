public class Linked_List {
Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        Linked_List linked_list = new Linked_List();
        linked_list.head = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        linked_list.head.next = secondNode;
        secondNode.next = thirdNode;

        while (linked_list.head != null){
            System.out.println("Linked List Value : "+linked_list.head.data);
            linked_list.head = linked_list.head.next;
        }
    }

}
