package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

class BinaryTreeNode<T> {
    T data;
    // Left Child Reference
    BinaryTreeNode<T> left;
    // Right Child Reference
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        // left and right default value is null
    }
}

class BinaryTreeOperations {
    String nodename = "root";
    Scanner sc = new Scanner(System.in);

    BinaryTreeNode<Integer> insert() {// insert logic
        System.out.println("Enter the data " + nodename + " enter -1 to exit");
        int data = sc.nextInt();
        // if -1 is entered
        if (data == -1) {
            return null;
        }
        // if data is not -1
        // create a node
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(data);
        // prepare a DST
        nodename = "left";
        node.left = insert();
        // when there is -1
        // backtrack to its root node
        nodename = "right";
        node.right = insert();
        // when there is -1
        // backtrack to its root node
        nodename = "root";
        return node;
    }

    void print(BinaryTreeNode<Integer> root) {// print logic
        if (root == null) {
            return;
        }
        // branch recursion
        // DFT (Depth First Traversal)
        String result = "";
        result += root.data + "-->";
        // if left node is not null
        if (root.left != null) {
            result += "left" + root.left.data;
        }
        // if right node is not null
        if (root.right != null) {
            result += "right" + root.right.data;
        }
        System.out.println(result);
        print(root.left);
        print(root.right);
    }

    // Using Recursion way
    // DFT
    // InOrder(Left,Parent,Right)
    void InOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
    }

    // PreOrder(Parent,Left,Right)
    void PreOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }

    // PostOrder(Right,Left,Parent)
    void PostOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }

    // using Iterative Way
    // Preorder(Parent,Left,Right)
    // Approach 1
    void IPreOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode<Integer>> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            BinaryTreeNode<Integer> currentNode = s.pop();
            System.out.print(currentNode.data + " ");
            // checking right node first
            if (currentNode.right != null) {
                s.push(currentNode.right);
            }
            // checking left node
            if (currentNode.left != null) {
                s.push(currentNode.left);
            }
        }
        System.out.println();
    }

    // Preorder(Parent,Left,Right)
    // Approach 2
    void IPreOrderA2(BinaryTreeNode<Integer> root) {// optimized
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode<Integer>> s = new Stack<>();
        BinaryTreeNode<Integer> currentNode = root;
        while (!s.isEmpty() || currentNode != null) {
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                if (currentNode.right != null) {
                    s.push(currentNode.right);
                }
                currentNode = currentNode.left;
            }
            if (!s.isEmpty()) {
                currentNode = s.pop();
            }
        }
        System.out.println();
    }

    // InOrder(Left,Parent,Right)
    void IInOrder(BinaryTreeNode<Integer> root) {
        // if (root == null) {
        // return;
        // }
        Stack<BinaryTreeNode<Integer>> s = new Stack<>();
        BinaryTreeNode<Integer> currentNode = root;
        while (currentNode != null || !s.isEmpty()) {
            // Traversing towards the left end until null is encountered
            while (currentNode != null) {
                s.push(currentNode);
                currentNode = currentNode.left;
            }
            // after null is encountered
            currentNode = s.pop();
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.right;
        }
    }

    void IPostOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode<Integer>> s = new Stack<>();
        Stack<Integer> result = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            BinaryTreeNode<Integer> currentNode = s.pop();
            result.push(currentNode.data);
            if (currentNode.left != null) {
                s.push(currentNode.left);
            }
            if (currentNode.right != null) {
                s.push(currentNode.right);
            }
        }
        while (!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }

    // BFT (Breath First Traversal) = (Level Order Traversal) LOT
    void LevelOrder(BinaryTreeNode<Integer> root) {
        LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> node = queue.removeFirst();
            System.out.print(node.data + " ");
            // checking parent's left and right child
            if (node.left != null) {
                queue.addLast(node.left);
            }
            if (node.right != null) {
                queue.addLast(node.right);
            }
        }
    }

    void LevelOrderA2(BinaryTreeNode<Integer> root) {
        LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                BinaryTreeNode<Integer> currentNode = queue.poll();
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    queue.addLast(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.addLast(currentNode.right);
                }
            }
            System.out.println();
        }
    }

    int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int height = Math.max(leftHeight, rightHeight);
        return height + 1;
    }

    int sizeOfBinaryTree(BinaryTreeNode<Integer> root) {// total number of nodes
        if (root == null) {
            return 0;
        }
        int count = 1;
        count += sizeOfBinaryTree(root.left);
        count += sizeOfBinaryTree(root.right);
        return count;
    }

    // public void Kth_Node_From_Root(BinaryTreeNode<Integer> root, int k) {
    // if (root == null || k <= 0) {
    // return;
    // }
    // if (k > height(root)) {
    // return;
    // }
    // BinaryTreeNode<Integer> current = root;
    // int i = 1;

    // while (i < k && current != null) {
    // if (current.left != null) {
    // current = current.left;
    // } else if (current.right != null) {
    // current = current.right;
    // }
    // i++;
    // }

    // if (i == k && current != null) {
    // System.out.println(current.data);
    // }
    // }

    int largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int[] max = { Integer.MIN_VALUE };
        inOrderForlargest(root, max);
        return max[0];
    }

    void inOrderForlargest(BinaryTreeNode<Integer> node, int[] max) {
        if (node == null) {
            return;
        }
        inOrderForlargest(node.left, max);
        if (node.data > max[0]) {
            max[0] = node.data;
        }
        inOrderForlargest(node.right, max);
    }

    int smallest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int[] min = { Integer.MAX_VALUE };
        inOrderForlargest(root, min);
        return min[0];
    }

    void inOrderForsmallest(BinaryTreeNode<Integer> node, int[] min) {
        if (node == null) {
            return;
        }
        inOrderForlargest(node.left, min);
        if (node.data < min[0]) {
            min[0] = node.data;
        }
        inOrderForlargest(node.right, min);
    }

    // using recursion
    int prev_level = 0;

    void leftViewOfTree(BinaryTreeNode<Integer> root, int currentLevel) {
        if (root == null) {
            return;
        }
        if (prev_level < currentLevel) {
            System.out.print(root.data + " ");
            prev_level = currentLevel;
        }
        leftViewOfTree(root.left, currentLevel + 1);
        leftViewOfTree(root.right, currentLevel + 1);
    }

    int prevlevel = 0;

    void rightViewOfTree(BinaryTreeNode<Integer> root, int currentLevel) {
        if (root == null) {
            return;
        }
        if (prevlevel < currentLevel) {
            System.out.print(root.data + " ");
            prevlevel = currentLevel;
        }
        rightViewOfTree(root.right, currentLevel + 1);
        rightViewOfTree(root.left, currentLevel + 1);
    }

    // using iteration
    void ILeftViewOfTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queue_size = queue.size();
            for (int i = 0; i < queue_size; i++) {
                BinaryTreeNode<Integer> current = queue.poll();
                if (i == 0) {
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
    }

    void IReftViewOfTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queue_size = queue.size();
            for (int i = queue_size - 1; i >= 0; i--) {
                BinaryTreeNode<Integer> current = queue.poll();
                if (i == queue_size - 1) {
                    System.out.print(current.data + " ");
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
                if (current.left != null) {
                    queue.offer(current.left);
                }
            } // or
              // for (int i = 0; i<queue_size; i++) {
              // BinaryTreeNode<Integer> current = queue.poll();
              // if (i == 0) {
              // System.out.print(current.data + " ");
              // }
              // if (current.right != null) {
              // queue.offer(current.right);
              // }
              // if (current.left != null) {
              // queue.offer(current.left);
              // }
              // }
        }
    }

    void verticalOrder(BinaryTreeNode<Integer> root) {// printing logic
        int distance = 0;
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        verticalOrderLogic(root, distance, map);
        for (Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    void verticalOrderLogic(BinaryTreeNode<Integer> root, int distance, TreeMap<Integer, ArrayList<Integer>> map) {
        if (root == null) {
            return;
        }
        if (map.get(distance) == null) {// distance don't exist
            // then create a new arraylist
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(distance, list);
        } else {// distance exist
                // get the old arraylist and update its value
            ArrayList<Integer> l = map.get(distance);
            l.add(root.data);
            map.put(distance, l);
        }
        verticalOrderLogic(root.left, distance - 1, map);
        verticalOrderLogic(root.right, distance + 1, map);
    }
}

public class BinaryTree_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeOperations opr = new BinaryTreeOperations();
        BinaryTreeNode<Integer> root = null;
        while (true) {
            System.out.println("Binary Tree Operations");
            System.out.println("1 - Insert");
            System.out.println("2 - Print");
            System.out.println("3 - InOrder");
            System.out.println("4 - PreOrder");
            System.out.println("5 - PostOrder");
            System.out.println("6 - PreOrder By Iteration");
            System.out.println("7 - InOrder By Iteration");
            System.out.println("8 - PostOrder By Iteration");
            System.out.println("9 - for BFT");
            System.out.println("10 - for finding tree height");
            // System.out.println("11 - find kth node from root");
            System.out.println("12 - to find largest number");
            System.out.println("13 - to find smallest number");
            System.out.println("14 - to print left view of the tree");
            System.out.println("15 - to print right view of the tree");
            System.out.println("16 - to print vertical order");
            System.out.println("20 - Exit");
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    root = opr.insert();
                    break;
                case 2:
                    opr.print(root);
                    break;
                case 3:
                    opr.InOrder(root);
                    break;
                case 4:
                    opr.PreOrder(root);
                    break;
                case 5:
                    opr.PostOrder(root);
                    break;
                // case 6:
                // opr.IPreOrder(root);
                // break;
                case 6:
                    opr.IPreOrderA2(root);
                    break;
                case 7:
                    opr.IInOrder(root);
                    break;
                case 8:
                    opr.IPostOrder(root);
                    break;
                // case 9:
                // opr.LevelOrder(root);
                // break;
                case 9:
                    opr.LevelOrderA2(root);
                    break;
                case 10:
                    System.out.println(opr.height(root));
                    break;
                // case 11:
                // System.out.println("Enter value for k");
                // int k = sc.nextInt();
                // opr.Kth_Node_From_Root(root, k);
                // break;
                case 12:
                    System.out.println(opr.largest(root));
                    break;
                case 13:
                    System.out.println(opr.smallest(root));
                    break;
                // case 14://recursion
                // opr.leftViewOfTree(root, 1);
                // break;
                case 14:// iterative
                    opr.ILeftViewOfTree(root);
                    break;
                // case 15:// recursion
                // opr.rightViewOfTree(root, 1);
                // break;
                case 15:// iterative
                    opr.IReftViewOfTree(root);
                    break;
                case 16:
                    opr.verticalOrder(root);
                    break;
                case 20:
                    return;
            }
        }
    }
}