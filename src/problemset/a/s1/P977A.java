package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/977/A
 * @author ey
 *
 */
public class P977A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        Integer num = Integer.valueOf(inputs[0]);
        Integer times = Integer.valueOf(inputs[1]);
        while (times > 0) {
            if (num % 10 == 0) {
                num = num / 10;
            } else {
                num = num - 1;
            }
            times--;
        }
        System.out.println(num);
    }
}
