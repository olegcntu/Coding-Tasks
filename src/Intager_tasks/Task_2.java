package Intager_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
    public static void Entrt() {
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
        System.out.println(F(value));
    }

    public static int F(int value){
        int f=1;
        for (int i = 1; i <=value ; i++) {
            f=f*i;
        }
        return f;
    }



}
