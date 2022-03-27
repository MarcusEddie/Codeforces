package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/705/A
 * @author ey
 *
 */
public class P705A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String rs = "";
        Integer sign = 1;
        while (cnt > 0) {
            if (sign > 0) {
                rs = rs + "I hate ";
            } else {
                rs = rs + "I love ";
            }
            sign = -sign;
            cnt--;
            if (cnt > 0) {
                rs = rs + "that ";
            } else {
                rs = rs +"it";
            }
        }
        System.out.println(rs);
    }
}
