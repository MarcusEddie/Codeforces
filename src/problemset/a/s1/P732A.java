package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/732/A
 * @author ey
 *
 */
public class P732A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Integer price = Integer.valueOf(input[0]);
        Integer r = Integer.valueOf(input[1]);
        if ((price - r) % 10 ==0) {
            System.out.println(1);
        } else if (price % 5 == 0 && price % 10 != 0) {
            System.out.println(2);
        } else if (price % 5 == 0 && price % 10 == 0) {
            System.out.println(1);
        } else {
            Integer rs = 0;
            while (true) {
                if (((rs * price - r) % 10 == 0) || (rs > 0 && (rs * price) % 10 == 0)) {
                    break;
                }
                if (rs >= 10) {
                    break;
                }
                rs++;
            }
            System.out.println(rs > 10 ? 10 : rs);
        }
    }
}
