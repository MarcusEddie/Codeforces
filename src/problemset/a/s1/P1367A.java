package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1367/A
 * @author ey
 *
 */
public class P1367A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            String input = br.readLine();
            String tmp = "";
            for(int i = 0; i < input.length() - 1; i = i + 2) {
                if (i == 0) {
                    tmp = tmp + input.substring(i, i + 2);
                } else {
                    tmp = tmp + input.substring(i + 1, i + 2);
                }
            }
            rs.add(tmp);
            cnt--;
        }
        for (int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i));
        }
    }
}
