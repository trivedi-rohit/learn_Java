// Binary Search:
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 52, 78, 98, 12, 17};
        Arrays.sort(arr); // Sorting the array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find: ");
        int key = scan.nextInt();

        int result = BinarySearch(arr, key);
        if (result == -1) {
            System.out.println("Number not found in the array.");
        } else {
            System.out.println("Number " + key + " found at index " + result);
        }scan.close();
    }
    // Binary search method
    public static int BinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // Key found
            } else if (arr[mid] < key) {
                low = mid + 1; // Key is in the upper half
            } else {
                high = mid - 1; // Key is in the lower half
            }
        }
        return -1; // Key not found
    }
}
