package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * https://codeforces.com/problemset/problem/41/A
 */
public class P41A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String target = br.readLine();
        String rs = "";
        for(int i = 0; i < input.length(); i++) {
            rs = String.valueOf(input.charAt(i)) + rs;
        }
        if (rs.contentEquals(target)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
