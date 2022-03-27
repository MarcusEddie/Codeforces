package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/750/A
 * @author ey
 *
 */
public class P750A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Integer cnt = Integer.valueOf(input[0]);
        Integer threshold = Integer.valueOf(input[1]);
        Integer leftTime = 240 - threshold;
        Integer rs = 0;
        Integer sum = 0;
        while (true) {
            sum = sum + rs * 5;
            if ((sum > leftTime - (rs + 1) * 5) || (rs >= cnt)) {
                break;
            }
            rs++;
        }
        System.out.println(rs);
    }
}
