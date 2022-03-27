package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * https://codeforces.com/problemset/problem/427/A
 * @author ey
 *
 */
public class P427A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String[] input = br.readLine().split(" ");
        Integer rs = 0;
        Integer cop = 0;
        for (int i = 0; i < input.length; i++) {
            Integer tmp = Integer.valueOf(input[i]);
            if (tmp > 0) {
                cop = cop + tmp;
            } else if (tmp < 0 && cop == 0) {
                rs = rs + 1;
            } else if (tmp < 0 && cop != 0)  {
                cop--;
            }
        }
        System.out.println(rs);
    }
}
