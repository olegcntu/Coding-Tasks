package codingtasksstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polyndrome {

    public static void enter() {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        System.out.println("Enter: ");
        try {
            st = read.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        chek(toChar(st), st.length());
    }

    public static char[] toChar(String st) {
        char charArr[] = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            charArr[i] = st.charAt(i);
        }
        return charArr;
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
