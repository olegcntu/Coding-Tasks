package codingtasksinteger;

public class BubbleSort {
    public static void buble() {
        int arr[] = {3, 2, 245, 2, 42, 2, 3, 6, 56, 34, 9, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int y = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = y;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
