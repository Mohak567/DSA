import java.util.ArrayList;

public class KMP_Optimized {
    public static int[] computeWeight(String pattern) {
        int[] weight = new int[pattern.length()];
        int length = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                weight[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = weight[length - 1];
                } else {
                    weight[i] = 0;
                    i++;
                }
            }
        }
        return weight;
    }

    public static ArrayList<Integer> search(String pattern, String text) {
        ArrayList<Integer> indices = new ArrayList<>();
        int[] weight = computeWeight(pattern);

        int i = 0, j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    indices.add(i - j);
                    j = weight[j - 1];
                }
            } else {
                if (j != 0) {
                    j = weight[j - 1];
                } else {
                    i++;
                }
            }
        }
        return indices;
    }
    public static void main(String[] args) {
        String txt = "abaabcabcabydddabcaby";
        String pattern = "abcaby";
        System.out.println(search(pattern,txt));
    }
}
