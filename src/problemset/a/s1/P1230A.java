package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * https://codeforces.com/problemset/problem/1230/A
 * @author ey
 *
 */
public class P1230A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String str = io.readLine();
        String[] input = str.split(" ");
        Integer sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < input.length; i++) {
            sum = sum + Integer.valueOf(input[i]);
            map.put(new Integer(i), Integer.valueOf(input[i]));
        }
        if (sum % 2 == 0) {
            sum = sum / 2;
            boolean flag = false;
            for (int i = 0; i < input.length; i++) {
                if (sum.equals(Integer.valueOf(input[i]))) {
                    flag =true;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                for(int i = 0; i< input.length; i++) {
                    for(int j =i + 1; j < input.length; j++) {
                        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>(map);
                        int tmp = map2.get(Integer.valueOf(i)) + map2.get(Integer.valueOf(j));
                        map2.remove(Integer.valueOf(i));
                        map2.remove(Integer.valueOf(j));
                        int tmp2 = 0;
                        Iterator<Entry<Integer, Integer>> it = map2.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<java.lang.Integer, java.lang.Integer> entry = (Map.Entry<java.lang.Integer, java.lang.Integer>) it
                                    .next();
                            tmp2 = tmp2 + entry.getValue();
                        }
                        if (tmp == tmp2) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            
        } else {
            System.out.println("NO");
        }
    }

}
