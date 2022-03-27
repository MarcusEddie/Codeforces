package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1303/A
 * 
 * @author ey
 *
 */
public class P1303A {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String input = io.readLine();
            boolean flag = false;
            Integer tmp = 0;
            for (int i = 0; i < input.length(); i++) {
                boolean flag2 = true;
                if (String.valueOf(input.charAt(i)).equals("1")) {
                    flag = true;
                }
                int tail = i + 1;
                for (int j = tail; j < input.length(); j++) {
                    if (String.valueOf(input.charAt(j)).equals("1")) {
                        flag2 = false;
                    }
                }
                if (flag2) {
                    break;
                }
                if (flag && String.valueOf(input.charAt(i)).equals("0")) {
                    tmp++;
                }
            }
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
