public class MadhavArray {

  static int isMadhavArray(int[] a) {
    //		check if length of array is n*(n+1)/2 for some n.
    double n = (Math.sqrt(((8 * a.length) + 1)) - 1) / 2;
    int m = (int) n;
    int calculateLfromN = (int) (m * (m + 1)) / 2;
    if (calculateLfromN == a.length) {
      int currentSum = 0;
      int start = 0;
      int end = 1;
      int loop = 1;
      while (loop <= m) {
        for (int i = start; i < end; i++) {
          currentSum += a[i];
        }
        if (currentSum == a[0]) {
          currentSum = 0;
          start = end;
          loop++;
          end = start + loop;
        } else {
          return 0;
        }
      }
      return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(isMadhavArray(new int[] { 2, 1, 1 }));
    System.out.println(isMadhavArray(new int[] { 2, 1, 1, 4, -1, -1 }));
    System.out.println(
      isMadhavArray(new int[] { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 })
    );
    System.out.println(isMadhavArray(new int[] { 18, 9, 10, 6, 6, 6 }));
    System.out.println(isMadhavArray(new int[] { -6, -3, -3, 8, -5, -4 }));
    System.out.println(
      isMadhavArray(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 })
    );
    System.out.println(isMadhavArray(new int[] { 3, 1, 2, 3, 0 }));
  }
}
