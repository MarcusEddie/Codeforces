package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/1180/A
 * @author ey
 *
 */
public class P1180A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        Integer rs = 0;
        if (n.compareTo(1) == 0) {
            rs = 1;
        } else {
            int len = 2 * n - 1;
            rs = (1 + len) * (len / 2 + 1) - len;
        }
        System.out.println(rs);
    }

}
