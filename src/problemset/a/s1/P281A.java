package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/281/A
 * @author ey
 *
 */
public class P281A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int asc = input.charAt(0);
        if (asc > 64 && asc < 91) {
            System.out.println(input);
        } else if (asc > 96 && asc < 123) {
            asc = asc - 32;
            String rs = String.valueOf((char)asc) + input.substring(1);
            System.out.println(rs);
        }
    }
}
