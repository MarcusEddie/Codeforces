package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * https://codeforces.com/problemset/problem/1095/A
 * @author ey
 *
 */
public class P1095A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer len = Integer.valueOf(io.readLine());
        String input = io.readLine();
        String rs = "";
        int idx = 0;
        int cnt = 1;
        while(idx < input.length()) {
            rs = rs + String.valueOf(input.charAt(idx));
            idx = idx + cnt;
            cnt++;
        }
        System.out.println(rs);
    }
}
