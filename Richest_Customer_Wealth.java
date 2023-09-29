public class Richest_Customer_Wealth {
    public static int richest(int[][] mat) {
        int cus = 0;
        int temp = 0;
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            if (temp < sum) {
                temp = sum;
                cus = i;
            }
        }
        System.out.println("richest customer has " + temp);
        return cus;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 },
                { 5, 6, 9 },
                { 7, 2, 3 },
                { 8, 4, 2 } };
        System.out.println(richest(mat));
    }
}
