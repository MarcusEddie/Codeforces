package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/1220/A
 * @author ey
 *
 */
public class P1220A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        String input = io.readLine();
        int[] counts = {0,0,0,0,0};
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'o') {
                counts[0] = counts[0] + 1;
            } else if (input.charAt(i) == 'n') {
                counts[1] = counts[1] + 1;
            } else if (input.charAt(i) == 'e') {
                counts[2] = counts[2] + 1;
            } else if (input.charAt(i) == 'z') {
                counts[3] = counts[4] + 1;
            } else if (input.charAt(i) == 'r') {
                counts[4] = counts[4] + 1;
            }
        }
        String rs = "";
        for(int i = 0; i < counts[1]; i++) {
            rs = rs + "1 ";
        }
        for(int i = 0; i < counts[4]; i++) {
            rs = rs + "0 ";
        }
        System.out.println(rs.substring(0, rs.length() - 1));
    }

}
