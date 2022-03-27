package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1411/A
 */
public class P1411A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String input = io.readLine();
            Integer tmp = 0;
            for(int i = input.length() - 1; i >= 0; i--) {
                if (input.charAt(i) == ')') {
                    tmp++;
                } else {
                    break;
                }
            }
            if (len - tmp >= tmp) {
                rs.add("NO");
            } else {
                rs.add("YES");
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
