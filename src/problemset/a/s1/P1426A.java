package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1426/A
 */
public class P1426A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] input = br.readLine().split(" ");
            Integer n = Integer.valueOf(input[0]);
            Integer x = Integer.valueOf(input[1]);
            Integer f = 1;
            if (n.compareTo(2) <=0) {
                rs.add(1);
            } else {
                while (true) {
                    if (((((f - 1) * x + 3) <= n)&&(n <= f * x + 2))) {
                        break;
                    }
                    f++;
                }
                rs.add(f + 1);
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }
}
