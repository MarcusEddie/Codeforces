package problemset.b;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/734/B
 * @author ey
 *
 */
public class P734B {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] input = io.readLine().split(" ");
        Long num2 = Long.valueOf(input[0]);
        Long num3 = Long.valueOf(input[1]);
        Long num5 = Long.valueOf(input[2]);
        Long num6 = Long.valueOf(input[3]);
        Long min = num2;
        if (min.compareTo(num5) > 0) {
            min = num5;
        }
        if (min.compareTo(num6) > 0) {
            min = num6;
        }
        Long sum = min * 256;
        num2 = num2 -min;
        if (num3.compareTo(0L) > 0 && num2.compareTo(0L) > 0) {
            if (num2.compareTo(num3) >= 0) {
                sum = sum + 32 * num3;
            } else {
                sum = sum + 32 *num2;
            }
        }
        System.out.println(sum);
        
    }

}
