package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/540/A
 */
public class P540A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(io.readLine());
        String original = io.readLine();
        String target = io.readLine();
        Integer rs = 0;
        for (int i = 0; i < original.length(); i++) {
            Integer tmp = Integer.valueOf(original.charAt(i)) - Integer.valueOf(target.charAt(i));
            if (tmp.compareTo(0) < 0) {
                tmp = Math.abs(tmp);
            }
            if (tmp.compareTo(5) > 0) {
                tmp = 10 - tmp;
            }
            rs = rs + tmp;
        }
        System.out.println(rs);
    }

}
