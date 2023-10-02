public class Stack_Using_Array {
    public static class MyStack {
        int[] arr;
        int top;
        int capacity;

        public MyStack(int capacity) {
            arr = new int[capacity];
            top = -1;
        }

        public void push(int x) {
            if (top + 1 == capacity) {
                System.out.println("Stack is full");
            }
            arr[++top] = x;
            System.out.println(x + " pushed into the stack");
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top--];
        }

        public int size() {
            return top + 1;
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(50);
        s.push(10);
        s.push(60);
        s.push(90);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}