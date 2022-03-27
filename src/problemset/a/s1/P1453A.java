package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1453/A
 * @author ey
 *
 */
public class P1453A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] nm = io.readLine().split(" ");
            Integer n = Integer.valueOf(nm[0]);
            Integer m = Integer.valueOf(nm[1]);
            String[] ns = io.readLine().split(" ");
            String[] ms = io.readLine().split(" ");
            Integer tmp = 0;
            for (int i = 0; i <ns.length; i++) {
                for (int j = 0; j < ms.length; j++) {
                    if (ns[i].equals(ms[j])) {
                        tmp++;
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
