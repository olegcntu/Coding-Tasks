package String_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {

    public static void Entrt() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        System.out.println("Enter: ");
        try {
            st = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        chek(ToChar(st), st.length());
    }

    public static char[] ToChar(String st) {
        char CharArr[] = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            CharArr[i] = st.charAt(i);
        }
        return CharArr;
    }

    public static void chek(char arr[], int l) {

        for (int i = 0; i < l / 2; i++) {
            if (arr[i] != arr[l - i - 1]) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");

    }
}
