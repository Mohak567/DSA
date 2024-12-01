
import java.util.ArrayList;

class KMP{

    public static int[] computeWeight(String pattern){
        int[] weight = new int[pattern.length()];
        int length = 0;
        int i = 1;
        while(i < pattern.length()){
            if(pattern.charAt(i) == pattern.charAt(length)){
                length++;
                weight[i] = length;
                i++;
            }
            else{
                if(length != 0){
                    length = weight[length - 1];
                }
                else{
                    weight[i] = 0;
                    i++;
                }
            }
        }
        return weight;
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

    public static ArrayList<Integer> helper(String text, String pattern, int[] weight) {
        ArrayList<Integer> indices = new ArrayList<>();
        int startIndex = 0;

        while (startIndex <= text.length() - pattern.length()) {
            int matchIndex = findpattern(text.substring(startIndex), pattern, weight);
            if (matchIndex != -1) {
                matchIndex += startIndex;
                indices.add(matchIndex);
                startIndex = matchIndex + 1;
            } else {
                break;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        String txt = "abaabcabcabydddabcaby";
        String pattern = "abcaby";

        int[] weight = computeWeight(pattern);
        System.out.println(helper(txt, pattern, weight));
    }
}