class Node<T> {// T = type of data
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class Link_List_Operations<T> {
    void print(Node<T> start) {
        Node<T> temp = start;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // create a node
        Node<Integer> node = new Node(100);
        // connecting the node
        Node<Integer> node1 = new Node(200);
        node.next = node1;
        Link_List_Operations<Integer> l = new Link_List_Operations<>();
        l.print(node);
    }
}
