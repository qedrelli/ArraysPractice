public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        System.out.print("Array:");
        for (int n : numbers) {
            System.out.print(" " + n);
            sum += n;
        }
        System.out.println();

        double average = (double) sum / numbers.length;
        int above = 0;
        for (int n : numbers) {
            if (n > average) above++;
        }
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + above);
    }
}
