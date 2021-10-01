package codingtasksinteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static void enter() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        int value = 0;
        System.out.println("Enter: ");
        try {
            st = br.readLine();
            value = Integer.valueOf(st);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (value == 1 || value == 0) {
            System.out.println(1);
            return;
        }
        fibonachiCalculate(1, 1, value);
    }

    //    public static void fibonachiCalculate(int value) {
//        int tec = 1, pred = 1;
//        for (int i = 0; i < value - 1; i++) {
//            tec = pred + tec;
//            pred = tec - pred;
//        }
//        System.out.println(tec);
//    }
    public static void fibonachiCalculate(int value1, int value2, int num) {
        num--;
        if (num == 0) {
            System.out.println(value2);
            return;
        }
        ;
        fibonachiCalculate(value2, value2 + value1, num);
    }

}
