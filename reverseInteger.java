public class reverseInteger {

  static int f(int n) {
    int sign = 1;
    if (n < 0) {
      sign = -1;
      n = -n;
    }
    String str = "" + n;

    String reversed = "";
    for (int i = 0; i < str.length(); i++) {
      reversed = str.charAt(i) + reversed;
    }

    return sign * Integer.parseInt(reversed);
  }

  public static void main(String[] args) {
    System.out.println(f(-123456789));
    System.out.println(f(123456789));
  }
}
