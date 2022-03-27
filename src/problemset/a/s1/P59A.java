package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/59/A
 * @author ey
 *
 */
public class P59A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Integer cntOnL = 0;
        Integer cntOnU = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > 96 && input.charAt(i) < 123) {
                cntOnL++;
            }
            if (input.charAt(i) > 64 && input.charAt(i) < 91) {
                cntOnU++;
            }
        }
        if (cntOnL == cntOnU) {
            System.out.println(input.toLowerCase());
        } else if (cntOnL > cntOnU) {
            System.out.println(input.toLowerCase());
        } else {
            System.out.println(input.toUpperCase());
        }
    }
}
