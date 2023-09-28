public class Search_In_Tries {
    static class Node {
        Node[] children;
        boolean terminal;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            terminal = false;
        }
    }

    static Node root = new Node();

    static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            if (i == word.length() - 1) {
                current.children[index].terminal = true;
                // System.out.println("inserted word is - " + word);
            }
            current = current.children[index];
        }
    }

    static boolean search(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            Node node = current.children[index];
            if (node == null) {
                return false;
            }
            if (i == word.length() - 1 && node.terminal == false) {
                System.out.println("word don't exist");
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        insert("apple");
        insert("ball");
        insert("bat");
        insert("pen");
        System.out.println(search("bat"));
    }
}
