package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1535/A
 * @author ey
 *
 */
public class P1535A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] input = br.readLine().split(" ");
            Integer a = Integer.valueOf(input[0]);
            Integer b = Integer.valueOf(input[1]);
            Integer c = Integer.valueOf(input[2]);
            Integer d = Integer.valueOf(input[3]);
            Integer minA = a;
            Integer maxA = b;
            Integer minB = c;
            Integer maxB = d;
            if (a > b) {
                minA = b;
                maxA = a;
            }
            if (c > d) {
                minB = d;
                maxB = c;
            }
            if (minA.compareTo(maxB) > 0 || maxA.compareTo(minB) < 0) {
                rs.add(0);
            } else {
                rs.add(1);
            }
        }
        for (Integer integer : rs) {
            if (integer == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
