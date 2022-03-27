package problemset.a.s1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

/**
 * https://codeforces.com/problemset/problem/1370/A
 * @author ey
 *
 */
public class P1370A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer input = Integer.valueOf(br.readLine());
            rs.add(input / 2);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
