package codingtasksinteger;

import java.util.ArrayList;
import java.util.Collections;

public class Search {
    public static void calculate(ArrayList<Integer> sortList) {

        Collections.sort(sortList);

        int i = sortList.size() / 2;
        int SeachValue = 8;

        while (sortList.get(i) != SeachValue) {
            if (SeachValue > sortList.get(i)) {
                i = i + i / 2;
            } else {
                i = i - i / 2;
            }
        }
        System.out.println(sortList.get(i));
    }
}
