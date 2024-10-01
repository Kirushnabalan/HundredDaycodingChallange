import java.util.Arrays;

public class Day1{
    public static void main(String[] args) {
        int[] list = {12, 13, 2, 44};

        // Bubble Sort algorithm
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    // Swap the elements
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        // Print the sorted list
        System.out.println("Sorted List: " + Arrays.toString(list));
    }
}
