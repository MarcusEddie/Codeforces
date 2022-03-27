package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/1520/A
 * @author ey
 *
 */
public class P1520A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Set<String> tmp = new HashSet<String>();
            Set<String> tmp2 = new HashSet<String>();
            Integer days = Integer.valueOf(br.readLine());
            String input = br.readLine();
            String flag = "YES";
            for (int i = 0; i < input.length(); i++) {
                if (tmp.add(String.valueOf(input.charAt(i)))) {
                    tmp2.add(String.valueOf(input.charAt(i)));
                } else {
                    if (tmp2.contains(String.valueOf(input.charAt(i))) &&!(String.valueOf(input.charAt(i - 1)).equals(String.valueOf(input.charAt(i))))) {
                        flag = "NO";
                        break;
                    }
                }
            }
            rs.add(flag);
        }
        for (int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i));
        }
    }
}
