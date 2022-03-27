package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class P1397A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            Map<String, Integer> map = new HashMap<String, Integer>();
            int idx = n;
            while (idx > 0) {
                idx--;
                String input = io.readLine();
                for(int i = 0; i < input.length(); i++) {
                    if (map.containsKey(String.valueOf(input.charAt(i)))) {
                        Integer tmp = map.get(String.valueOf(input.charAt(i)));
                        map.put(String.valueOf(input.charAt(i)), tmp + 1);
                    } else {
                        map.put(String.valueOf(input.charAt(i)), 1);
                    }
                }
            }
            boolean flag = true;
            Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<java.lang.String,java.lang.Integer> entry = (Map.Entry<java.lang.String,java.lang.Integer>) it
                        .next();
                if(entry.getValue() % n != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                rs.add("YES");
            } else {
                rs.add("NO");
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
