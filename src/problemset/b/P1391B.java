package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1391/B
 * 
 * @author ey
 *
 */
public class P1391B {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] nm = io.readLine().split(" ");
            Integer n = Integer.valueOf(nm[0]);
            Integer m = Integer.valueOf(nm[1]);
            Integer tmp = 0;
            for (int i = 0; i < n; i++) {
                String singleRow = io.readLine();
                if (singleRow.lastIndexOf("R") == m - 1) {
                    tmp++;
                }
                if (i == n - 1) {
                    for (int j = 0; j < m; j++) {
                        if (singleRow.charAt(j) == 'D') {
                            tmp++;
                        }
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
