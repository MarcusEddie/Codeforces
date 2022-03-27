package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/734/A
 */
public class P734A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String input = br.readLine();
        Integer rs = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                rs++;
            }
        }
        if ((rs == cnt / 2) && (cnt % 2 == 0)) {
            System.out.println("Friendship");
        } else if ((rs <= cnt / 2)) {
            System.out.println("Danik");
        } else if ((rs > cnt / 2)) {
            System.out.println("Anton");
        }
    }
}
