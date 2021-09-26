package Intager_tasks;

public class Task_6 {
    public static void vub() {
        int arr[] = {3, 2, 245, 2, 42, 2, 3, 6, 56, 34, 9, 5,1};

        for(int i=0;i<arr.length;i++) {
            int min=Integer.MAX_VALUE,l=0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    l=j;
                }
            }
            arr[l]=arr[i];
            arr[i]=min;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}