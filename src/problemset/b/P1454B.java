package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * https://codeforces.com/problemset/problem/1454/B
 */
public class P1454B {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer nums = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            Map<String, Integer> map = new HashMap<String, Integer>();
            List<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < input.length; i++) {
                if (!map.containsKey(input[i])) {
                    map.put(input[i], i + 1);
                    tmp.add(Integer.valueOf(input[i]));
                } else {
                    if (tmp.indexOf(Integer.valueOf(input[i])) > -1) {
                        tmp.remove(tmp.indexOf(Integer.valueOf(input[i])));
                    }
                }
            }
            if (tmp.size() > 0) {
                Collections.sort(tmp);
                rs.add(map.get(String.valueOf(tmp.get(0))));
            } else {
                rs.add(-1);
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
