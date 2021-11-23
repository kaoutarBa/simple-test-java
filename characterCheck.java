public class characterCheck {

  static char[] myF(char[] L, int start, int len) {
    if (
      L.length < start + len ||
      L.length < start ||
      L.length < len ||
      start < 0 ||
      len < 0
    ) {
      return null;
    }
    char[] newL = new char[len];
    for (int i = start; i < start + len; i++) {
      newL[i - start] = L[i];
    }
    return newL;
  }

  public static void main(String[] args) {
    char[] myResult = new char[] { 'a', 'b', 'c' };

    System.out.println(myF(myResult, 0, 2));
    //System.out.println(characterCheck.f(new char[]{'a', 'b', 'c'}, 0, 3));
    //System.out.println(characterCheck.f(new char[]{'a', 'b', 'c'}, 0, 2));
    //System.out.println(characterCheck.f(new char[]{'a', 'b', 'c'}, 0, 1));
    //System.out.println(characterCheck.f(new char[]{'a', 'b', 'c'}, 1, 3));
    //System.out.println(characterCheck.f(new char[]{'a', 'b', 'c'}, 1, 2));

    //characterCheck.f(new char[]{'a','b','c'},0,4);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 0, 3);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 0, 2);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 0, 1);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 1, 3);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 1, 2);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 1, 1);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 2, 2);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 2, 1);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 3, 1);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, 1, 0);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, -1, 2);
    //characterCheck.f(new char[]{'a', 'b', 'c'}, -1, -2);
    //characterCheck.f(new char[]{}, 0, 1);

  }
}
