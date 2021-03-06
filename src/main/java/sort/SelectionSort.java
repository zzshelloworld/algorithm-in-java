package sort;
// 优化点
// 便利一次，找出最小值和最大值
// 一次提取两个数进行比较
// 不稳，两个相等的数会 交换位置，验证
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};

        for (int k = 0; k < arr.length - 1; k++) {
            int minPos = k;
            for (int j = k; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr, minPos, k);
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
