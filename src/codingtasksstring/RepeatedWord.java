package codingtasksstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RepeatedWord {

    public static void enter() {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        System.out.println("Enter: ");
        try {
            st = read.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String StArr[] = st.split(" ");
        check(StArr);
    }

    public static void check(String st[]) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < st.length; i++) {
            if (!map.containsKey(st[i])) {
                map.put(st[i], 1);
            } else
                map.put(st[i], map.get(st[i]) + 1);
        }

        int max = 0;

        for (Integer k : map.values()) {
            if (k > max) {
                max = k;
            }
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (pair.getValue().equals(max)) {
                System.out.println(pair.getKey());
            }
            it.remove(); // avoids a ConcurrentModificationException
        }
    }


}
