package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

/*
 * https://codeforces.com/problemset/problem/1598/A
 */
public class P1598A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String r1 = io.readLine();
            String r2 = io.readLine();
            boolean tmp2 = check(r1, r2);
            if (tmp2) {
                rs.add("NO");
            } else {
                rs.add("YES");
            }
        }

        for (String string : rs) {
            System.out.println(string);
        }
    }

    private static boolean check(String r1, String r2) {
        boolean rs = false;
        for (int i = 0; i < r1.length() - 1; i++) {
            if (r1.charAt(i) == '0' && r1.charAt(i + 1) == '1') {
                if (r2.charAt(i) == '1' && r2.charAt(i + 1) == '1') {
                    rs = true;
                    break;
                }
            }
            if (r2.charAt(i) == '0' && r2.charAt(i + 1) == '1') {
                if (r1.charAt(i) == '1' && r1.charAt(i + 1) == '1') {
                    rs = true;
                    break;
                }
            }
            if (r1.charAt(i) == '1' && r2.charAt(i) == '1') {
                rs = true;
                break;
            }
        }

        return rs;
    }
}
