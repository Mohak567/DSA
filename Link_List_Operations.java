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

    void detectCycleAndRemoveCycle() {// floyd cycle
        Node<T> slow = head;
        Node<T> fast = head;
        while (fast != null && fast.next != null) {// detecting the cycle
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Cycle is present");
                break;
            }
        }
        if (slow != fast) {// removing the cycle
            System.out.println("No cycle is present");
            return;
        }
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast.next = null;// break the cycle
    }

    void midElement() {
        if (head == null) {
            System.out.println("No element is present");
            return;
        }
        Node<T> slow = head;
        Node<T> fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    void findk(int k) {
        Node<T> i = head;
        Node<T> j = head;
        // move j till k
        for (int l = 1; l <= k; l++) {
            j = j.next;
        }
        // move j till end
        while (j != null) {
            i = i.next;
            j = j.next;
        }
        System.out.println(i.data);// kth data from last
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
            System.out.println("Enter 5 to check the presence of the cycle in LinkList");
            System.out.println("Enter 6 to find mid element");
            System.out.println("Enter 7 to find Kth element from the last of LinkList");
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
                case 5:
                    opr.detectCycleAndRemoveCycle();
                    break;
                case 6:
                    opr.midElement();
                    break;
                case 7:
                    System.out.println("Enter position");
                    opr.findk(sc.nextInt());
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
