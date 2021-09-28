package codingtasksstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Reverse {

    public static void enter() {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        System.out.println("Enter: ");
        try {
            st = read.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        rev(ToChar(st), st.length());
    }

    public static char[] ToChar(String st) {
        char charArr[] = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            charArr[i] = st.charAt(i);
        }
        return charArr;
    }

    public static void rev(char arr[], int l) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < l; i++) {
            stack.add(arr[i]);
        }
        for (int i = 0; i < l; i++) {
            System.out.print(stack.pop());
        }

    }

}
