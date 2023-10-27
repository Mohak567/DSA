package Tree;

class BSTnode<T> {
    T data;
    BSTnode left;
    BSTnode right;

    BSTnode(T data) {
        this.data = data;
        // left right are null
    }
}

class BSTOperations {

    void takeTreeValues() {
        root = insert(root, 10);
        BSTnode<Integer> t = insert(root, 5);
        t = insert(root, 7);
        t = insert(root, 20);
        // print(root);
        // BSTnode<Integer> n = search(root, 55);
        // System.out.println(n == null ? "No node found" : n.data + " node found");
        // System.out.println(minValue(root));
        System.out.println(maxValue(root));
    }

    BSTnode<Integer> root;// root is null

    BSTnode<Integer> insert(BSTnode<Integer> currentNode, int x) {
        // if root is not present
        if (currentNode == null) {
            currentNode = new BSTnode<Integer>(x);
            return currentNode;
        }
        // if root is present
        if (x < currentNode.data) {
            currentNode.left = insert(currentNode.left, x);
        } else if (x > currentNode.data) {
            currentNode.right = insert(currentNode.right, x);
        }
        return currentNode;
    }

    void print(BSTnode<Integer> root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }

    BSTnode<Integer> search(BSTnode<Integer> root, int element) {
        if (root == null || root.data == element) {
            return root;
        }

        if (root.data > element) {
            return search(root.left, element);
        } else {
            return search(root.right, element);
        }

    }

    int minValue(BSTnode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int min = root.data;
        while (root.left != null) {
            min = (int) root.left.data;
            root = root.left;
        }
        return min;
    }

    int maxValue(BSTnode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int max = root.data;
        while (root.right != null) {
            max = (int) root.right.data;
            root = root.right;
        }
        return max;
    }

    void remove(BSTnode<Integer> root, BSTnode<Integer> parent, boolean isLeft, int data) {
        if (data > root.data) {// going right
            remove(root.right, root, false, data);
        } else if (data < root.data) {// going left
            remove(root.left, root, true, data);
        } else {
            // data found
            // case 1 - leaf node
            if (root.left == null && root.right == null) {
                // unlinking
                if (isLeft) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
            // case 2 - left null but right not null
            if (root.left == null && root.right != null) {
                if (isLeft) {
                    parent.left = root.right;
                } else {
                    parent.right = root.right;
                }
            }
            // case 3 - right null but left not null
            if (root.left != null && root.right == null) {
                if (isLeft) {
                    parent.left = root.left;
                } else {
                    parent.right = root.left;
                }
            }
            // case 4 - left and right are not null
            if (root.left != null && root.right != null) {
                // find left max
                int max = maxValue(root.left);
                root.data = max;
                remove(root.left, root, true, max);
                // above operation can be done by find rigth min
            }
        }
    }
}

public class BST_Example {
    public static void main(String[] args) {
        BSTOperations opr = new BSTOperations();
        opr.takeTreeValues();
    }
}
