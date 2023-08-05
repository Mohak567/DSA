public class Stickler_Thief// GFG
/*
 * Stickler the thief wants to loot money from a society having n houses in a
 * single line. He is a weird person and follows a certain rule when looting the
 * houses. According to the rule, he will never loot two consecutive houses. At
 * the same time, he wants to maximize the amount he loots. The thief knows
 * which house has what amount of money but is unable to come up with an optimal
 * looting strategy. He asks for your help to find the maximum money he can get
 * if he strictly follows the rule. Each house has a[i]amount of money present
 * in it.
 */
{
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 10, 9, 11 };
        int n = arr.length;
        int curr = 0, rev = 0;

        for (int i = n - 1; i >= 0; i--) {

            int incl = arr[i] + rev;
            int excl = curr;
            rev = curr;
            curr = Math.max(incl, excl);
        }

        System.out.println(curr);
    }
}
