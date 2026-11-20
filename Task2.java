public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 28, 3, 19, 7, 15, 9};
        int maxIndex = 0, minIndex = 0;

        System.out.print("Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
            if (numbers[i] > numbers[maxIndex]) maxIndex = i;
            if (numbers[i] < numbers[minIndex]) minIndex = i;
        }
        System.out.println();
        System.out.println("Largest: " + numbers[maxIndex] + " at index " + maxIndex);
        System.out.println("Smallest: " + numbers[minIndex] + " at index " + minIndex);
    }
}
