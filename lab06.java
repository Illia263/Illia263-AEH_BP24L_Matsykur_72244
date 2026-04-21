public class lab06 {

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 20;

        System.out.println("Calculating factorial for number: " + number + "\n");

        long startTimeIter = System.nanoTime();
        long resultIter = factorialIterative(number);
        long endTimeIter = System.nanoTime();
        long durationIter = endTimeIter - startTimeIter;

        System.out.println("Iterative Result: " + resultIter);
        System.out.println("Iterative Time: " + durationIter + " nanoseconds\n");

        long startTimeRec = System.nanoTime();
        long resultRec = factorialRecursive(number);
        long endTimeRec = System.nanoTime();
        long durationRec = endTimeRec - startTimeRec;

        System.out.println("Recursive Result: " + resultRec);
        System.out.println("Recursive Time: " + durationRec + " nanoseconds");
    }
}