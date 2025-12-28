import java.util.*;

class Bsort {

    // Method to perform Bubble Sort (Ascending Order)
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();      // size of array
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the bubble sort method
        bubbleSort(arr);

        // Print sorted array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
