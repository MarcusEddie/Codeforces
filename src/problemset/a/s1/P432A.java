package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/432/A
 * @author ey
 *
 */
public class P432A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] times = br.readLine().split(" ");
        Integer cnt = Integer.valueOf(input[0]);
        Integer threshold = Integer.valueOf(input[1]);
        List<Integer> tmp = new ArrayList<Integer>();
        for (int i = 0; i < times.length; i++) {
            tmp.add(Integer.valueOf(times[i]));
        }
        Collections.sort(tmp);
        Integer rs = 0;
        for (int i = 2; i < times.length; i = i + 3) {
            if (tmp.get(i) + threshold <= 5) {
                rs++;
            }
        }
        System.out.println(rs);
    }
}
