package codingtasksinteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void enter() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        int value = 0;
        System.out.println("Enter: ");
        try {
            st = reader.readLine();
            value = Integer.valueOf(st);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(factorialCalculate(value));
    }

    public static int factorialCalculate(int value) {
        int number = 1;
        for (int i = 1; i <= value; i++) {
            number = number * i;
        }
        return number;
    }


}
