public class Divisible_By_Eleven {
  public static int divisible(String S) {
    int num = 0;
    for (int i = 0; i < S.length(); i++) {
      num = (num * 10) + (S.charAt(i) - '0');
      num = num % 11;
    }
    if (num == 0) {
      return 1;
    }

    return 0;
  }

  public static void main(String[] args) {
    String s = "4564";
    System.out.println(divisible(s));
  }
}
