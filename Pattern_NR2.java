public class Pattern_NR2 {
    static void star(int star) {
        if (star == 0) {
            return;
        }
        System.out.print("* ");
        star(star - 1);
    }

    static void print(int star, int line) {
        if (line == 0) {
            return;
        }
        System.out.println();
        star(star);
        print(star, line - 1);
    }

    public static void main(String[] args) {
        print(5, 5);
    }
}
/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */