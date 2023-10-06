import java.util.*;

class Node<T> {// T = type of data
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class Link_List_Operations<T> {
    Scanner sc = new Scanner(System.in);
    Node<T> head;
    Node<T> tail;

    void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail = tail.next;
            tail = newNode;
        }
    }

    void addAtPosition(int posi, T data) {
        Node<T> newNode = new Node(data);
        if (posi == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int i = 1;
        Node<T> temp = head;
        while (i < posi) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void delete(int posi) {
        if (head == null) {
            System.out.println("LinkList is empty");
        }
        Node<T> temp = head;
        Node<T> temp2 = null;
        if (posi == 0) {
            temp = head.next;
            head = temp;
            return;
        }
        int i = 1;
        while (i < posi) {
            temp2 = temp;
            temp = temp.next;
            i++;
        }
        temp2.next = temp.next;
    }

    void print(Node<T> start) {
        Node<T> temp = start;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Link_List_Operations opr = new Link_List_Operations();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("Enter 0 to exit");
            System.out.println("Enter 1 to add");
            System.out.println("Enter 2 to print");
            System.out.println("Enter 3 to add at a posistion");
            System.out.println("Enter 4 to delete");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Program ends");
                    return;
                case 1:
                    opr.add(sc.nextInt());
                    opr.add(sc.nextInt());
                    opr.add(sc.nextInt());
                    opr.add(sc.nextInt());
                    break;
                case 2:
                    opr.print(opr.head);
                    break;
                case 3:
                    System.out.println("Enter position");
                    int p = sc.nextInt();
                    System.out.println("Enter the data");
                    opr.addAtPosition(p, sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter position");
                    opr.delete(sc.nextInt());
                    break;
                default:
                    System.out.println("Wrong chice");
                    return;
            }
        }
        // // create a node
        // Node<Integer> node = new Node(100);
        // // connecting the node
        // Node<Integer> node1 = new Node(200);
        // node.next = node1;
        // Link_List_Operations<Integer> l = new Link_List_Operations<>();
        // l.print(node);
    }
}
