package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1620/A
 */
public class P1620A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            if (input.length() == 2) {
                if (input.charAt(0) != input.charAt(1)) {
                    rs.add("NO");
                } else {
                    rs.add("YES");
                }
            } else if (input.length() == 1) {
                rs.add("YES");
            } else {
                int n = 0;
                for(int i = 0; i < input.length(); i++) {
                  if (input.charAt(i) == 'N') {
                      n++;
                  } 
              }
                if (n == 1) {
                    rs.add("NO");
                } else {
                    rs.add("YES");
                }
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
