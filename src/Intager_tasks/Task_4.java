package Intager_tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task_4 {
    public static void div(ArrayList<Integer>LI){

        Collections.sort(LI);

        int i=0,p=8;
        i = LI.size() / 2;

        while(LI.get(i)!=p) {

            if (p > LI.get(i)) {
                i = i + i / 2;
            } else {
                i = i -i / 2;
            }
        }
        System.out.println(LI.get(i));
    }
}
