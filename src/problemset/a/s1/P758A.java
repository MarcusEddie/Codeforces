package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * https://codeforces.com/problemset/problem/758/A
 * @author ey
 *
 */
public class P758A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String[] input = br.readLine().split(" ");
        Integer rs = 0;
        Integer max = 0;
        for (int i = 0; i < input.length; i++) {
            Integer tmp = Integer.valueOf(input[i]);
            if (tmp > max) {
                max = tmp;
            }
            rs = rs + tmp;
        }
        System.out.println(max * cnt - rs);
    }
}
