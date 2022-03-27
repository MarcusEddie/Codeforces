package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/119/A
 */
public class P119A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] input = io.readLine().split(" ");
        Integer a = Integer.valueOf(input[0]);
        Integer b = Integer.valueOf(input[1]);
        Integer n = Integer.valueOf(input[2]);
        int sign = 1;
        while (true) {
            int gcd = 0;
            if (sign > 0) {
                gcd = gcd(a, n);
            } else {
                gcd = gcd(b, n);
            }
            if (gcd <= n) {
                n = n - gcd;
            } else {
                break;
            }
            sign = -sign;
        }
        if (sign > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    
    public static Integer gcd(Integer a, Integer b) {
        if (b.compareTo(0) == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
