public class Determine_If_String_Halves_Are_AlikeA2 {
    public static boolean halvesAreAlike(String s) {
        int vowelCount = 0;
        s = s.toLowerCase();
        char[] chArray = s.toCharArray();

        for (int i = 0; i < chArray.length / 2; i++)
            if (isVowel(chArray[i]))
                vowelCount++;
        for (int i = chArray.length / 2; i < chArray.length; i++)
            if (isVowel(chArray[i]))
                vowelCount--;

        return vowelCount == 0;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("leetcode"));
    }
}
