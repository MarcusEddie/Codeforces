package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/266/B
 * @author ey
 *
 */
public class P268B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        Integer num = Integer.valueOf(inputs[0]);
        Integer time = Integer.valueOf(inputs[1]);
        String queue = br.readLine();
        while (time > 0) {
            Integer i = 1;
            while (i < num) {
                if (queue.charAt(i - 1) == 'B' && queue.charAt(i) == 'G') {
                    queue = queue.substring(0, i - 1) + "GB" + queue.substring(i + 1);
                    i = i + 2;
                } else {
                    i++;
                }
            }
            time--;
        }
        System.out.println(queue);
    }
}
