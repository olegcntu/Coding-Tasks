package codingtasksstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Anagrams {
    public static void enter() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st1 = null;
        String st2 = null;
        System.out.println("Enter: ");
        try {
            st1 = br.readLine();
            st2 = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        chek(st1, st2);
    }

    public static void chek(String st1, String st2) {
        char CharArr1[] = st1.toCharArray();
        char CharArr2[] = st2.toCharArray();
        TreeSet<Character> ts1 = new TreeSet<>();
        TreeSet<Character> ts2 = new TreeSet<>();

        for (int i = 0; i < st1.length(); i++) {
            ts1.add(CharArr1[i]);
        }
        for (int i = 0; i < st2.length(); i++) {
            ts2.add(CharArr2[i]);
        }
        if (ts1.containsAll(ts2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}