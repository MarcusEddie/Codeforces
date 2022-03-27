package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1547/B
 * @author ey
 *
 */
public class P1547B {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            if (input.indexOf("a") < 0) {
                rs.add("NO");
                continue;
            } else if (input.indexOf("a") != input.lastIndexOf("a")) {
                rs.add("NO");
                continue;
            }
            int ascii = 97;
            boolean tmp = true;
            String init = "a";
            for(int i = 1; i < input.length(); i++) {
                String tr = init + String.valueOf((char)(ascii + 1));
                if (input.indexOf(tr) >=0) {
                    init = tr;
                    ascii++;
                    continue;
                }
                tr = String.valueOf((char)(ascii + 1)) + init;
                if (input.indexOf(tr) >=0) {
                    init = tr;
                    ascii++;
                    continue;
                }
                tmp = false;
                break;
            }
            if (tmp) {
                rs.add("YES");
            } else {
                rs.add("NO");
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
