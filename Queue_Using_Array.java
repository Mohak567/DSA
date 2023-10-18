public class Queue_Using_Array {
    static int capacity = 5;
    static int front = 0;
    static int rear = -1;
    static int[] arr = new int[capacity];

    public int dequeue(int[] arr, int f, int r) {
        if (f > r) {
            throw new IllegalArgumentException("Underflow");
        }
        int temp = arr[f];
        arr[f++] = 0;
        front++;
        return temp;
    }

    public void enqueue(int[] arr, int f, int r, int x) {
        if (r == capacity - 1) {
            System.out.println("Overflow condition");
            return;
        }
        arr[++r] = x;
        rear++;
        System.out.println(x + " is inserted");
    }

    public void print(int[] arr, int f, int r) {
        for (int i = f; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size(int f, int r) {
        return (r - f + 1);
    }

    public boolean isEmpty(int f, int r) {
        return f > r ? true : false;
    }

    public int frontElement(int f) {
        return arr[f];
    }

    public int rearElement(int r) {
        return arr[r];
    }

    public static void main(String[] args) {
        Queue_Using_Array opr = new Queue_Using_Array();

        opr.enqueue(arr, front, rear, 1);
        opr.enqueue(arr, front, rear, 2);
        opr.enqueue(arr, front, rear, 3);
        opr.enqueue(arr, front, rear, 4);
        opr.enqueue(arr, front, rear, 5);
        System.out.println("Deleted element = " + opr.dequeue(arr, front, rear));
        opr.print(arr, front, rear);
        System.out.println(opr.isEmpty(front, rear) ? "Queue is empty" : "Queue is not empty");
        System.out.println(opr.size(front, rear) + " size");
        System.out.println(opr.frontElement(front) + "front element");
        System.out.println(opr.rearElement(rear) + " rear element");
        opr.print(arr, front, rear);
        System.out.println("Deleted element = " + opr.dequeue(arr, front, rear));
        System.out.println("Deleted element = " + opr.dequeue(arr, front, rear));
        System.out.println("Deleted element = " + opr.dequeue(arr, front, rear));
        System.out.println("Deleted element = " + opr.dequeue(arr, front, rear));
        System.out.println(opr.isEmpty(front, rear) ? "Queue is empty" : "Queue is not empty");
    }
}