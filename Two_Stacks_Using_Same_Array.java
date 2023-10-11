public class Two_Stacks_Using_Same_Array {
    int[] arr;
    int capacity;
    int top1, top2;

    Two_Stacks_Using_Same_Array(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            throw new RuntimeException("stack1 is full");
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            throw new RuntimeException("stack2 is full");
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1--];
            return x;
        } else {
            throw new RuntimeException("stack1 is empty");
        }
    }

    int pop2() {
        if (top2 <= capacity) {
            int x = arr[top2++];
            return x;
        } else {
            throw new RuntimeException("stack2 is empty");
        }
    }

    int peek1() {
        if (top1 >= 0) {
            int x = arr[top1];
            return x;
        } else {
            throw new RuntimeException("stack1 is empty");
        }
    }

    int peek2() {
        if (top2 < capacity) {
            int x = arr[top2];
            return x;
        } else {
            throw new RuntimeException("stack1 is empty");
        }
    }

    int size1() {
        return top1 + 1;
    }

    int size2() {
        return capacity - top2;
    }

    boolean isEmpty1() {
        return top1 == -1;
    }

    boolean isEmpty2() {
        return top2 == capacity;
    }

    public static void main(String[] args) {
        // checking
        // Two_Stacks_Using_Same_Array s = new Two_Stacks_Using_Same_Array(6);
        // s.push1(10);
        // s.push1(20);
        // s.push1(30);
        // s.push2(40);
        // s.push2(50);
        // s.push2(60);
        // System.out.println(s.pop1());
        // System.out.println(s.pop1());
        // System.out.println(s.peek1());
        // System.out.println(s.pop1());
        // System.out.println(s.isEmpty1());
        // System.out.println(s.size1());
        // System.out.println(s.size2());
        // System.out.println(s.peek2());
    }
}
