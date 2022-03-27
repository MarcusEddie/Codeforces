package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1512/A
 * @author ey
 *
 */
public class P1512A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String cnts = br.readLine();
            String[] input = br.readLine().split(" ");
            int cursor = 0;
            for (int i = 0; i < input.length - 2; i++) {
                if (Integer.valueOf(input[i]) != Integer.valueOf(input[i +1]) && Integer.valueOf(input[i + 1]) == Integer.valueOf(input[i + 2])) {
                    cursor = i +1;
                } else if (Integer.valueOf(input[i]) != Integer.valueOf(input[i +1]) && Integer.valueOf(input[i]) == Integer.valueOf(input[i + 2])) {
                    cursor = i +2;
                } else if (Integer.valueOf(input[i]) == Integer.valueOf(input[i +1]) && Integer.valueOf(input[i + 1]) != Integer.valueOf(input[i + 2])) {
                    cursor = i +3;
                }
            }
            rs.add(cursor);
        }
        for (int i = 0; i < rs.size(); i++) {
            System.out.println(rs.get(i));
        }
    }
}
