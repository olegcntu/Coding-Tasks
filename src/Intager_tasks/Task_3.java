package Intager_tasks;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {

    public static void P64() {
        //int arr[]=new int[Integer.MAX_VALUE];
        int arr[] = {1, 2, 5, 43, 2, 1, 5, 5, 5, 2, 32, 23, 53, 43, 8,49,49,49,49,49,49,49};
        int k[] = new int[65];
//        for(int i=0;i<Integer.MAX_VALUE;i++){
//            arr[i]= new Random().nextInt();
//        }

        for (int i = 1; i < arr.length; i++) {
            k[arr[i]]++;
        }

        int m = 0;
        for (int i = 1; i <= 64; i++) {
            if (m < k[i]) {
                m = i;
            }
        }
        System.out.println(m);

    }

}
