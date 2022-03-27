package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1627/A
 * @author ey
 *
 */
public class P1627A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            String[] nm = io.readLine().split(" ");
            Integer n = Integer.valueOf(nm[0]);
            Integer m = Integer.valueOf(nm[1]);
            Integer r = Integer.valueOf(nm[2]);
            Integer c = Integer.valueOf(nm[3]);
            Boolean black = false;
            Boolean selfBlack = false;
            Boolean sameRow = false;
            Boolean sameCow = false;
            for(int i = 0; i < n; i++) {
                String input = io.readLine();
                if (input.contains("B")) {
                    black = true;
                }
                if (i == (r - 1) && input.charAt(c - 1) == 'B') {
                    selfBlack = true;
                } else if (i == (r - 1) && input.indexOf("B") >= 0) {
                    sameRow = true;
                } else if (input.charAt(c - 1) == 'B') {
                    sameCow = true;
                }
            }
            if (!black) {
                rs.add(-1);
            } else if (selfBlack) {
                rs.add(0);
            } else if (sameRow || sameCow) {
                rs.add(1);
            } else {
                rs.add(2);
            }
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
