package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/486/A
 * @author ey
 *
 */
public class P486A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long cnt = Long.valueOf(br.readLine());
        if (cnt % 2 == 0) {
            System.out.println(cnt / 2);
        } else {
            System.out.println(cnt / 2 - cnt);
        }
    }
}
