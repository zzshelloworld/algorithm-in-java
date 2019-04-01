package sort;
// 去掉swap 方法

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        sortNoSwap(arr);
        printAll(arr);
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] > arr[j - 1]) {
                    break;
                } else {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static void sortNoSwap(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for (j = i; j > 0; j--) {
                if (tmp > arr[j - 1]) {
                    break;
                } else {
                    arr[j] = arr[j - 1];
                }
            }
            arr[j] = tmp;
            printAll(arr);
        }
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
