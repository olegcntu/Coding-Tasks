package String_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Task_2 {

    public static void Entrt() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        System.out.println("Enter: ");
        try {
            st = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Rev(ToChar(st),st.length());
    }

    public static char[] ToChar(String st) {
        char CharArr[] = new char[st.length()];
        for (int i = 0; i < st.length(); i++) {
            CharArr[i] = st.charAt(i);
        }
        return  CharArr;
    }

    public static void Rev(char arr[],int l){

        Stack<Character> c= new Stack<Character>();
        for (int i=0;i<l;i++){
           c.add(arr[i]);
        }

        for(int i=0;i<l;i++){
            System.out.print(c.pop());
        }

    }

}
