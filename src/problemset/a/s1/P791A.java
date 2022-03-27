package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/791/A
 * @author ey
 *
 */
public class P791A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Integer a = Integer.valueOf(input[0]);
        Integer b = Integer.valueOf(input[1]);
        Integer rs = 0;
        while (3 * a <= 2 * b) {
            a = 3 * a;
            b = 2 * b;
            rs++;
        }
        System.out.println(rs + 1);
    }
}
