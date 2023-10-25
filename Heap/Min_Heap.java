package Heap;

public class Min_Heap {
    public int[] heap;
    public int size;
    public int capacity;

    public Min_Heap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    public int leftChild(int index) {
        return 2 * index + 1;
    }

    public int rightChild(int index) {
        return 2 * index + 2;
    }

    public void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }
        int current = size;
        heap[size++] = value;

        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int delete() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        int x = heap[0];
        heap[0] = heap[--size];
        minHeapify(0);
        return x;
    }

    public void minHeapify(int index) {
        int parent = index;
        int lChild = leftChild(index);
        int rChild = rightChild(index);

        if (lChild < size && heap[lChild] < heap[parent]) {
            parent = lChild;
        }

        if (rChild < size && heap[rChild] < heap[parent]) {
            parent = rChild;
        }

        if (parent != index) {
            swap(parent, index);
            minHeapify(parent);
        }
    }

    public static void main(String[] args) {
        Min_Heap opr = new Min_Heap(10);
        opr.insert(1);
        opr.insert(4);
        opr.insert(5);
        opr.insert(2);
        opr.insert(3);
        System.out.println(opr.delete());
        System.out.println(opr.delete());
        System.out.println(opr.delete());
    }
}
