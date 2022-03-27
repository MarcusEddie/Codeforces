package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/599/A
 * @author ey
 *
 */
public class P599A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] input = io.readLine().split(" ");
        Long d1 = Long.valueOf(input[0]);
        Long d2 = Long.valueOf(input[1]);
        Long d3 = Long.valueOf(input[2]);
        Long tmp = d1;
        if (d1.compareTo(d2) > 0) {
            d1 = d2;
            d2 = tmp;
        }
        tmp = d2;
        if (d2.compareTo(d3) > 0) {
            d2 = d3;
            d3 = tmp;
        }
        tmp = d1;
        if (d1.compareTo(d2) > 0) {
            d1 = d2;
            d2 = tmp;
        }
        Long rs = 0L;
        if (d1 + d2 - d3 < 0) {
            rs = 2 * (d1 + d2);
        } else {
            rs = d1 + d2 + d3;
        }
        System.out.println(rs);
    }

}
