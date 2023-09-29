public class Suffix_And_Prefix_In_Tries {
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
                System.out.println("inserted word is - " + word);
            }
            current = current.children[index];
        }
    }

    // suffix
    static void suffix(String word) {
        for (int i = 0; i < word.length(); i++) {
            String s = word.substring(i);
            insert(s);
        }
    }

    // prefix
    static void prefix(String word) {
        for (int i = 0; i <= word.length(); i++) {
            String s = word.substring(0, i);
            insert(s);
        }
    }

    public static void main(String[] args) {
        suffix("suffix");
        prefix("prefix");
    }
}
