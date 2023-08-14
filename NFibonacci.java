class NFibonacci {
  static int nthFibonacci(int n) {
    if (n <= 1)
      return n;
    int MOD = 1000000007;
    int[] fi = new int[n + 1];
    fi[0] = 0;
    fi[1] = 1;
    for (int i = 2; i <= n; i++) {
      fi[i] = (fi[i - 1] + fi[i - 2]) % MOD;
    }
    return fi[n];
  }

  public static void main(String[] args) {
    int n = 100;
    System.out.println(nthFibonacci(n));
  }
}
