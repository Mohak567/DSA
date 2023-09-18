public class KMP_Algorithm {
    static int[] computeWeight(String pattern) {// making weight array
        int length = 0;
        int j = 1;
        int[] weightarr = new int[pattern.length()];
        weightarr[0] = 0;
        while (j < pattern.length()) {
            if (pattern.charAt(j) == pattern.charAt(length)) {
                length++;
                weightarr[j] = length;
                j++;
            } else {
                if (length != 0) {
                    length = weightarr[length - 1];
                } else {
                    weightarr[j] = 0;
                    j++;
                }
            }
        }
        return weightarr;
    }

    static int findpattern(String text, String pattern, int[] weightarr) {// using weight array
        int i = 0, j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    return i - j;
                }
            } else {
                if (j != 0) {
                    j = weightarr[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String pattern = "abacd";
        String text = "ababdabacdabab";
        int[] warr = computeWeight(pattern);
        System.out.println(findpattern(text, pattern, warr));
    }
}
