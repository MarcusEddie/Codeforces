package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * https://codeforces.com/problemset/problem/822/A
 * @author ey
 *
 */
public class P822A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] input = io.readLine().split(" ");
        Long a = Long.valueOf(input[0]);
        Long b = Long.valueOf(input[1]);
        Double product = 1D;
        Long tmp = a;
        if (tmp.compareTo(b) < 0) {
            a = b;
            b = tmp;
        }
        while (b.compareTo(0L) > 0) {
            product = product * b;
            b--;
        }
        String rs = new BigDecimal(product).toString();
        System.out.println(rs);
    }

}
