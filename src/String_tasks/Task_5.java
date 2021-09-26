package String_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_5 {

    public static void Entrt() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        System.out.println("Enter: ");
        try {
            st = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String StArr[] = st.split(" ");
        Check(StArr);
    }

    public static void Check(String st[]) {
        Map<String, Integer> M = new HashMap<>();
        for (int i = 0; i < st.length; i++) {
            if (!M.containsKey(st[i])) {
                M.put(st[i], 1);
            }
            else
            M.put(st[i], M.get(st[i]) + 1);
        }

        int max=0;

        for (Integer k : M.values()) {
           if(k>max){max=k;}
        }

//        for (String stk: M.keySet()) {
//            if(stk.){
//                System.out.println();
//            }

            Iterator it = M.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                if(pair.getValue().equals(max)){
                    System.out.println(pair.getKey());}
                it.remove(); // avoids a ConcurrentModificationException
            }
        }



}
