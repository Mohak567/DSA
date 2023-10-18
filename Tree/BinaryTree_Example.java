package Tree;

import java.util.Scanner;
import java.util.Stack;

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
        // DFT
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
            System.out.println("9 - Exit");
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
                case 9:
                    return;
            }
        }
    }
}