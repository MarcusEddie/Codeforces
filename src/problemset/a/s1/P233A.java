package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/233/A
 */
public class P233A {

    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(re.readLine());
        if (n % 2 == 1) {
            System.out.println(-1);
        } else {
            String rs = "";
            for (int i = 1; i < n; i = i + 2) {
                rs = rs + String.valueOf(i + 1) + " " + String.valueOf(i) + " ";
            }
            System.out.println(rs.substring(0, rs.length() - 1));
        }
    }

}
