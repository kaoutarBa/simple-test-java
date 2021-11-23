public class PrimeCount {

  static int primeCount(int start, int end) {
    int countPrime = 0;
    for (int number = start; number <= end; number++) {
      boolean isPrime = true;
      if (number > 1) {
        for (int divider = 2; divider <= number / 2; divider++) {
          if (number % divider == 0) {
            isPrime = false;
            break;
          }
        }
        if (isPrime) {
          countPrime++;
        }
      }
    }
    return countPrime;
  }

  public static void main(String[] args) {
    System.out.println(primeCount(10, 30));
    System.out.println(primeCount(11, 29));
    System.out.println(primeCount(20, 22));
    System.out.println(primeCount(1, 1));
    System.out.println(primeCount(5, 5));
    System.out.println(primeCount(6, 2));
    System.out.println(primeCount(-10, 6));
  }
}
