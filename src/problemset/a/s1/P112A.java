package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/112/A
 * @author ey
 *
 */
public class P112A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().toLowerCase();
        String str2 = br.readLine().toLowerCase();
        if (str1.equals(str2)) {
            System.out.println(0);
        } else {
            for (int i = 0; i < str1.length(); i++) {
                int asc1 = str1.charAt(i);
                int asc2 = str2.charAt(i);
                if (asc1 < asc2) {
                    System.out.println(-1);
                    break;
                }else if (asc1 > asc2) {
                    System.out.println(1);
                    break;
                }
            }
        }
    }
}
