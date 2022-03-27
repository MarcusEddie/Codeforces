package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/731/A
 * 
 */
public class P731A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Integer rs = 0;
        int cursor = 97;
        for(int i = 0; i < input.length(); i++) {
            int cur = input.charAt(i);
            int offset = cur - cursor;
            if (offset < 0) {
                offset = Math.abs(offset);
            }
            if (offset > 13) {
                offset = 26 - offset;
            }
            rs = rs + offset;
            cursor = cur;
        }
        System.out.println(rs);
    }

}
