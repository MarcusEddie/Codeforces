package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/546/A
 * @author ey
 *
 */
public class P546A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        Integer price = Integer.valueOf(inputs[0]);
        Integer money = Integer.valueOf(inputs[1]);
        Integer banana = Integer.valueOf(inputs[2]);
        Integer sum = 0;
        for (int i = 1; i <= banana; i++) {
            sum = sum + i * price;
        }
        if (sum > money) {
            System.out.println(sum - money);
        } else {
            System.out.println(0);
        }
    }
}
