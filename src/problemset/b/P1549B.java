package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1549/B
 * @author ey
 *
 */
public class P1549B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            String tRow = io.readLine();
            String dRow = io.readLine();
            Integer tmp = 0;
            int[] slot = new int[n + 1];
            for(int i = 0; i < n; i++) {
                if (dRow.charAt(i) == '1' && tRow.charAt(i) == '0') {
                    tmp++;
                    slot[i] = 1;
                } else if (dRow.charAt(i) == '1' && tRow.charAt(i) != '0' ) {
                    if (i - 1 >= 0 && slot[i - 1] == 0 && tRow.charAt(i - 1) == '1') {
                        tmp++;
                        slot[i - 1] = 1;
                    } else if (i + 1<n && slot[i + 1] == 0 && tRow.charAt(i + 1) == '1') {
                        tmp++;
                        slot[i + 1] =1;
                    }
                }
            }
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
