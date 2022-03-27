package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/1061/A
 */
public class P1061A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] input = io.readLine().split(" ");
        Integer n = Integer.valueOf(input[0]);
        Integer s = Integer.valueOf(input[1]);
        Integer rs = 0;
        int i = 0;
        if (n == 1) {
            System.out.println(s);
        } else {
            rs =  s / n;
            s = s % n;
            while (s > 0) {
                if ((n - i) > 0 && s >= n - i) {
                    s = s -(n -i);
                    rs++;
                } else {
                    i++;
                }
            }
            System.out.println(rs);
        }
    }

}
