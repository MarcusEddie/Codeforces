package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/431/A
 * @author ey
 *
 */
public class P431A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] calories = br.readLine().split(" ");
        String input = br.readLine();
        Integer rs = 0;
        for (int i = 0; i < input.length(); i++) {
            rs = rs + Integer.valueOf(calories[Integer.valueOf(String.valueOf(input.charAt(i))) - 1]);
        }
        System.out.println(rs);
    }
}
