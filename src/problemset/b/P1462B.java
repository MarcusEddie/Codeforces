package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1462/B
 */
public class P1462B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String input = io.readLine();
            boolean flag = false;
            if (input.indexOf("2020") == 0 || input.lastIndexOf("2020") == input.length() - 4) {
                flag = true;
            }
            if (input.indexOf("2") == 0 && input.lastIndexOf("020") == input.length() - 3) {
                flag = true;
            }
            if (input.indexOf("20") == 0 && input.lastIndexOf("20") == input.length() - 2) {
                flag = true;
            }
            if (input.indexOf("202") == 0 && input.lastIndexOf("0") == input.length() - 1) {
                flag = true;
            }
            if (flag) {
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
