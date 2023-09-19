public class RabinKarp {// iterative approach
    public static long hashCode(String pattern) {
        long hashValue = 0;
        for (int i = 0; i < pattern.length(); i++) {
            hashValue += pattern.charAt(i) * Math.pow(10, i);
        }
        return hashValue;
    }

    public static int searchPattern(String text, String pattern) {
        long hashVlaue = hashCode(pattern);
        for (int i = 0; i < text.length() - pattern.length(); i++) {
            long hashtextvalue = hashCode(text.substring(i, i + pattern.length()));
            if (hashtextvalue == hashVlaue) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "acaddabbjgbd";
        String pattern = "bbjg";
        System.out.println(searchPattern(text, pattern));
    }
}
