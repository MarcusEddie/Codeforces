package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;

/**
 * https://codeforces.com/problemset/problem/520/A
 * @author ey
 *
 */
public class P520A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String input = br.readLine();
        Set<String> rs = new HashSet<String>();
        if (input.length() >= 26) {
            input = input.toLowerCase();
            for (int i = 0; i < input.length(); i++) {
                rs.add(String.valueOf(input.charAt(i)));
            }
        }
        if (rs.size()== 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
