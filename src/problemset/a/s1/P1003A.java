package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/1003/A
 * @author ey
 *
 */
public class P1003A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        String input = io.readLine();
        if (cnt.compareTo(1) == 0) {
            System.out.println(1);
        } else {
            String[] inputs = input.split(" ");
            int[] val = new int[101];
            for (int i = 0; i < inputs.length; i++) {
                Integer tmp = Integer.valueOf(inputs[i]);
                val[tmp] = val[tmp] + 1;
            }
            Integer max = 0;
            for (int i = 0; i < val.length; i++) {
                if (val[i] > max) {
                    max = val[i];
                }
            }
            System.out.println(max);
        }
    }
}
