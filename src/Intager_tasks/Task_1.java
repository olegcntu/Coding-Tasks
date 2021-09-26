package Intager_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {

    public static void Enter() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        int value=0;
        System.out.println("Enter: ");
        try {
            st = br.readLine();
            value=Integer.valueOf(st);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(Fib(value));
        Fib(value);
    }

    public static void Fib(int value){
        int tec=1,pred=1;
        for (int i = 0; i < value-1; i++) {

            tec=pred+tec;
            pred=tec-pred;

        }
        System.out.println(tec);

    }
}
