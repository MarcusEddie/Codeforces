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

/*
 * https://codeforces.com/problemset/problem/1616/A
 */
public class P1616A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (int i = 0; i < input.length; i++) {
                if (map.containsKey(input[i])) {
                    Integer tmp = map.get(input[i]);
                    map.put(input[i], tmp + 1);
                } else {
                    if (input[i].indexOf("-") == 0 && map.containsKey(input[i].substring(1))) {
                        Integer tmp = map.get(input[i].substring(1));
                        map.put(input[i].substring(1), tmp + 1);
                    } else if (input[i].indexOf("-")!=0) {
                        map.put(input[i], 1);
                    } else if (input[i].indexOf("-") == 0 && !map.containsKey(input[i].substring(1))) {
                        map.put(input[i].substring(1), 1);
                    }
                }
            }
            Integer tmp = 0;
            if (map.size() == 1 && map.containsKey("0")) {
                tmp = 1;
            } else {
                Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
                            .next();
                    if (entry.getValue().equals(1)) {
                        tmp++;
                    } else if (entry.getKey().equals("0")) {
                        tmp++;
                    } else {
                        tmp = tmp + 2;
                    }
                }
            }
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
