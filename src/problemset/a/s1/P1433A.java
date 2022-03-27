package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1433/A
 * @author ey
 *
 */
public class P1433A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String input = br.readLine();
            Integer tmp = 0;
            for (int i = 0; i < input.length(); i++) {
                tmp = tmp + i + 1;
            }
            
            Integer input2 = Integer.valueOf(input);
            input2 = input2 % 10;
            tmp = tmp + 10 * (input2 - 1);
            rs.add(tmp);
        }
        for (int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i));
        }
    }
}
