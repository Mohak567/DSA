public class Trapping_RainWater {// using pre-computational technique
    public static void main(String[] args) {
        int[] pillars = { 4, 2, 0, 3, 2, 5 };
        int n = pillars.length;
        if (n == 0) {
            System.out.println("no water can be stored");
            return;
        }
        int totalwaterstored = 0;
        // for left pillars
        int[] leftpmax = new int[n];
        leftpmax[0] = pillars[0];
        for (int i = 1; i < n; i++) {
            leftpmax[i] = Math.max(pillars[i], leftpmax[i - 1]);
        }
        // for right pillars
        int[] rightpmax = new int[n];
        rightpmax[n - 1] = pillars[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightpmax[i] = Math.max(pillars[i], rightpmax[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int currentp = pillars[i];
            int decidingp = Math.min(leftpmax[i], rightpmax[i]);
            if (decidingp > currentp) {
                totalwaterstored += decidingp - currentp;
            }
        }
        System.out.println(totalwaterstored);
    }
}
