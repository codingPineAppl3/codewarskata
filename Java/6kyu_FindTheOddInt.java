public class FindOdd {
  public static int findIt(int[] a) {
    int odd = 0;
    for(int item : a) {
      odd ^= item;
    }
    return odd;
  }
}