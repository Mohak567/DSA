public class BarChart {
    public static void main(String[] args) {
        int[] bar = { 0, 2, 7, 9, 6 };
        int max = 0;
        for (int element : bar) {
            if (max < element) {
                max = element;
            }
        }
        int min = 1;
        for (int i = max; i >= min; i--) {
            for (int j = 0; j < bar.length; j++) {
                if (i < bar[j]) {
                    System.out.print("\t*");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
