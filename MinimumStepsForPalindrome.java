class MinimumStepsForPalindrome{

    public static int minimumSteps(String s){
        String rev = new StringBuilder(s).reverse().toString();
        String concat = s + "$" + rev;
        int[] lps = new int[concat.length()];
        int j = 0;
        for(int i=1;i<concat.length();i++){
            while (j > 0 && concat.charAt(i) != concat.charAt(j)) {
                j = lps[j-1];
            }
            if(concat.charAt(i) == concat.charAt(j)){
                j++;
            }
            lps[i] = j;
        }
        return s.length() - lps[concat.length() - 1];
    }

    public static void main(String[] args){
        String s = "abc";
        System.out.println(minimumSteps(s));
    }
}