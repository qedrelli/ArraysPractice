public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {5, -3, 0, 8, -1, 0, 12, -7, 4, 2};
        int positive = 0, negative = 0, zero = 0;

        System.out.print("Array:");
        for (int n : numbers) {
            System.out.print(" " + n);
            if (n > 0) positive++;
            else if (n < 0) negative++;
            else zero++;
        }
        System.out.println();
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
