package Tree;

import java.util.Scanner;

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
            System.out.println("3 - Exit");
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
                    return;
            }
        }
    }
}