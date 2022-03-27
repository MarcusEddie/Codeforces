package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://codeforces.com/problemset/problem/1607/A
 * @author ey
 *
 */
public class P1607A {

    public static void main(String[] args) throws IOException{
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(re.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String seq = re.readLine();
            String input = re.readLine();
            Integer tmp = 0;
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (int i = 0; i < seq.length(); i++) {
                map.put(String.valueOf(seq.charAt(i)), i + 1);
            }
            for (int i = 1; i < input.length(); i++) {
                tmp = tmp + Math.abs(map.get(String.valueOf(input.charAt(i))) - map.get(String.valueOf(input.charAt(i - 1))));
            }
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
