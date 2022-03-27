package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1619/A
 * @author ey
 *
 */
public class P1619A {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(reader.readLine());
        List<String> rs = new ArrayList<String>();
        
        while (cnt > 0) {
            cnt--;
            String input = reader.readLine();
            if (input.length() % 2 == 1) {
                rs.add("NO");
            } else {
                String left = input.substring(0, input.length() / 2);
                String right = input.substring(input.length() / 2);
                if (left.equals(right)) {
                    rs.add("YES");
                } else {
                    rs.add("NO");
                }
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
        
    }

}
