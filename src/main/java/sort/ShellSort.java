package sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        sortNoSwap(arr);
        printAll(arr);
    }

    private static void sort(int[] arr) {

    }

    private static void sortNoSwap(int[] arr) {

    }

    private static void printAll(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
