package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/723/A
 * @author ey
 *
 */
public class P723A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Integer x1 = Integer.valueOf(input[0]);
        Integer x2 = Integer.valueOf(input[1]);
        Integer x3 = Integer.valueOf(input[2]);
        Integer mid = 0;
        if(x1 > x2) {
            mid = x1;
            x1 = x2;
            x2 = mid;
        }
        if (x1 > x3) {
            mid = x1;
            x1 = x3;
            x3 = mid;
        }
        if (x2 > x3) {
            mid = x2;
            x2 = x3;
            x3 = mid;
        }
        System.out.println(Math.abs(x1 - x2) + Math.abs(x2 - x3));
    }
}
