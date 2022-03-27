package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/1146/A
 */
public class P1146A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String input = io.readLine();
        Integer a = 0;
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                a++;
            }
        }
        if (a > input.length() - a) {
            System.out.println(input.length());
        } else {
            System.out.println(2 * a - 1);
        }
    }

}
