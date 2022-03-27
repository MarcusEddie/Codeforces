package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/711/A
 * 
 * @author ey
 *
 */
public class P711A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        String flag = "NO";
        while (cnt > 0) {
            cnt--;
            String[] input = io.readLine().split("\\|");
            if (input[0].equals("OO") || input[1].equals("OO")) {
                if (flag.equals("NO")) {
                    flag = "YES";
                    if (input[0].equals("OO")) {
                        rs.add("++|" + input[1]);
                    } else {
                        rs.add(input[0] + "|++");
                    }
                } else {
                    rs.add(input[0] + "|" + input[1]);
                }
            } else {
                rs.add(input[0] + "|" + input[1]);
            }
        }
        if (flag.equals("NO")) {
            System.out.println(flag);
        } else {
            System.out.println(flag);
            for (String string : rs) {
                System.out.println(string);
            }
        }
    }

}
