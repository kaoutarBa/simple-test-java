public class OddMinusEven {

  public int calcul(int[] L) {
    int sum = 0;
    for (int i = 0; i < L.length; i++) {
      if (L[i] % 2 == 0) {
        sum -= L[i];
      } else {
        sum += L[i];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    OddMinusEven myArray = new OddMinusEven();
    int[] arrayToTest = {};
    int result = myArray.calcul(arrayToTest);

    System.out.println(result);
  }
}
