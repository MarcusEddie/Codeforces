package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/686/A
 * @author ey
 *
 */
public class P686A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] cnt = io.readLine().split(" ");
        Integer n = Integer.valueOf(cnt[0]);
        Long x = Long.valueOf(cnt[1]);
        Integer kid = 0;
        while (n > 0) {
            n--;
            String[] input = io.readLine().split(" ");
            if (input[0].equals("+")) {
                x = x + Long.valueOf(input[1]);
            } else {
                if (x.compareTo(Long.valueOf(input[1])) >= 0) {
                    x = x - Long.valueOf(input[1]);
                } else {
                    kid++;
                }
            }
        }
        System.out.println(String.valueOf(x) + " " + String.valueOf(kid));
    }

}
