package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/1030/A
 * @author ey
 *
 */
public class P1030A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.valueOf(br.readLine());
        String[] resp = br.readLine().split(" ");
        Integer rs = 0;
        for (int i = 0; i < resp.length; i++) {
            if (Integer.valueOf(resp[i]) == 1) {
                rs = 1;
            }
        }
        if (rs == 1) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
