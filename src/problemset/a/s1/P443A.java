package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;

/**
 * https://codeforces.com/problemset/problem/443/A
 * @author ey
 *
 */
public class P443A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input.length() == 2) {
            System.out.println(0);
        } else {
            input = input.substring(1, input.length() - 1);
            String[] tmp = input.split(",");
            Set<String> rs = new HashSet<String>();
            for (int i = 0; i < tmp.length; i++) {
                rs.add(tmp[i].trim());
            }
            System.out.println(rs.size());
        }
    }
}
