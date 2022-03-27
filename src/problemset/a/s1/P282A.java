package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/282/A
 * @author ey
 *
 */
public class P282A {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        Integer x = 0;
        while (cnt > 0) {
            String input = br.readLine();
            if (input.contains("+")) {
                x++;
            }else if (input.contains("-")) {
                x--;
            }
            cnt--;
        }
        System.out.println(x);
        
    }

}
