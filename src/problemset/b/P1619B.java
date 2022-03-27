package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1619/B
 * @author ey
 *
 */
public class P1619B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<Integer> rs = new ArrayList<Integer>();
        while (cnt > 0) {
            cnt--;
            Long input = Long.valueOf(io.readLine());
            Integer tmp = (int) Math.floor(Math.sqrt(input));
            Integer tmp2 = (int) Math.floor(Math.pow(input, 1.0/3.0));
            if (input.compareTo((Long.valueOf(tmp2 + 1)* Long.valueOf(tmp2 + 1) * Long.valueOf(tmp2 + 1))) == 0)  {
                tmp2++;
            }
            tmp = tmp + tmp2;
            for(int i = 1; i<= tmp2; i++) {
                int j = (int) Math.sqrt(i);
                if (j * j == i) {
                    tmp--;
                }
            }
            rs.add(tmp);
        }
        for (Integer integer : rs) {
            System.out.println(integer);
        }
    }

}
