package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/110/A
 */
public class P110A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Integer cnt = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '4' || input.charAt(i) == '7') {
                cnt++;
            }
        }
        if (cnt == 7 || cnt == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
