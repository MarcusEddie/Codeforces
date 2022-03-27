package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1567/A
 */
public class P1567A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer col = Integer.valueOf(io.readLine());
            String input = io.readLine();
            String tmp = "";
            for(int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'U') {
                    tmp = tmp + "D";
                } else if (input.charAt(i) == 'D') {
                    tmp = tmp + "U";
                } else if (input.charAt(i) == 'L') {
                    tmp = tmp + "L";
                } else {
                    tmp = tmp + "R";
                }
            }
            rs.add(tmp);
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
