package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1311/A
 * @author ey
 *
 */
public class P1311A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] input = br.readLine().split(" ");
            Integer a = Integer.valueOf(input[0]);
            Integer b = Integer.valueOf(input[1]);
            if (a.compareTo(b) < 0) {
                if ((b - a) % 2 == 0) {
                    rs.add(2);
                } else {
                    rs.add(1);
                }
            } else if (a.compareTo(b) == 0) {
                rs.add(0);
            } else {
                if ((b - a) % 2 == 0) {
                    rs.add(1);
                } else {
                    rs.add(2);
                }
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
