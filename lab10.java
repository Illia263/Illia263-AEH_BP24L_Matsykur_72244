public class lab10 {

  public static int[] countAndSumElements(int[] input) {
    if (input == null || input.length == 0) {
      return new int[0];
    }

    int negativeCount = 0;
    int positiveSum = 0;

    for (int i = 0; i < input.length; i++) {
      if (input[i] < 0) {
        negativeCount++;
      } else if (input[i] > 0) {
        positiveSum += input[i];
      }
    }

    return new int[] { negativeCount, positiveSum };
  }

  public static void main(String[] args) {
    int[] testArray = { 1, 2, 3, 4, 5, -3, -2, -1 };
    int[] result = countAndSumElements(testArray);

    if (result.length > 0) {
      System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
    }
  }
}