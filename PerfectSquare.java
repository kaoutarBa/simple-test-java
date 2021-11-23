public class PerfectSquare {

  static int nextPerfectSquare(int n) {
    if (n < 0) return 0;
    double baseNumber = Math.sqrt(n);
    int nextPerfectSquareBase = (int) (baseNumber + 1);
    return nextPerfectSquareBase * nextPerfectSquareBase;
  }

  public static void main(String[] args) {
    System.out.println(nextPerfectSquare(6));
    System.out.println(nextPerfectSquare(36));
    System.out.println(nextPerfectSquare(0));
    System.out.println(nextPerfectSquare(-5));
  }
}
