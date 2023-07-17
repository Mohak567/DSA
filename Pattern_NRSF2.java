public class Pattern_NRSF2 {
    static void star(int star) {
        if (star == 0) {
            return;
        }
        star(star - 1);
        System.out.print("* ");

    }

    static void line(int line, int star) {
        if (line == 0) {
            return;
        }
        line(line - 1, star);
        System.out.println();
        star(star);
    }

    public static void main(String[] args) {
        line(5, 5);
    }
}
/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */