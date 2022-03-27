package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/266/A
 * @author ey
 *
 */
public class P266A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine()) - 1;
        String input = br.readLine();
        Integer rs = 0;
        while (cnt > 0) {
            int tmp = 1;
            if (input.charAt(cnt) != input.charAt(cnt - tmp)) {
                cnt--;
            } else {
                while ((cnt - tmp >= 0) && (input.charAt(cnt) == input.charAt(cnt - tmp))) {
                    rs++;
                    tmp++;
                }
                cnt = cnt - tmp;
            }
        }
        System.out.println(rs);
    }
}
