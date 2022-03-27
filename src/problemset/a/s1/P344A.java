package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/344/A
 * @author ey
 *
 */
public class P344A {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        Integer rs = 0;
        Integer former = 0;
        while (cnt > 0) {
            Integer input = Integer.valueOf(br.readLine());
            if (!former.equals(input)) {
                rs++;
            }
            former = input;
            cnt--;
        }
        System.out.println(rs);
    }
}
