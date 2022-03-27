package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

/**
 * https://codeforces.com/problemset/problem/1547/A
 * 
 * @author ey
 *
 */
public class P1547A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            io.readLine();
            String[] r1 = io.readLine().split(" ");
            String[] r2 = io.readLine().split(" ");
            String[] r3 = io.readLine().split(" ");
            Integer xa = Integer.valueOf(r1[0]);
            Integer ya = Integer.valueOf(r1[1]);

            Integer xb = Integer.valueOf(r2[0]);
            Integer yb = Integer.valueOf(r2[1]);

            Integer xf = Integer.valueOf(r3[0]);
            Integer yf = Integer.valueOf(r3[1]);

            int tmp = Math.abs(xa - xb) + Math.abs(ya - yb);
            if (xa.compareTo(xb) == 0 || ya.compareTo(yb) == 0) {
                if (xa.compareTo(xb) == 0) {
                    if (ya.compareTo(yf) < 0 && yf.compareTo(yb) < 0 && xa.compareTo(xf) == 0) {
                        tmp = tmp + 2;
                    } else if (yb.compareTo(yf) < 0 && yf.compareTo(ya) < 0 && xa.compareTo(xf) == 0) {
                        tmp = tmp + 2;
                    }
                } else if (ya.compareTo(yb) == 0) {
                    if (xa.compareTo(xf) < 0 && xf.compareTo(xb) < 0 && ya.compareTo(yf) == 0) {
                        tmp = tmp + 2;
                    } else if (xb.compareTo(xf) < 0 && xf.compareTo(xa) < 0 && ya.compareTo(yf) == 0) {
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
