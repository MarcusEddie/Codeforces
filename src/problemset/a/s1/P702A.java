package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/702/A
 * @author ey
 *
 */
public class P702A {

    public static void main(String[] args) throws IOException{
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        Integer length = Integer.valueOf(re.readLine());
        String[] input = re.readLine().split(" ");
        Integer rs = 1;
        Integer rsf = 0;
        for (int i = 1; i < input.length; i++) {
            if (Long.valueOf(input[i]).compareTo(Long.valueOf(input[i - 1])) > 0) {
                rs++;
            } else {
                if (rs.compareTo(rsf) >= 0) {
                    rsf = rs;
                }
                rs = 1;
            }
        }
        if (rs.compareTo(rsf) >= 0) {
            rsf = rs;
        }
        System.out.println(rsf);
    }
}
