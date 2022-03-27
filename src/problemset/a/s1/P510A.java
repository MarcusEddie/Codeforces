package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/510/A
 * @author ey
 *
 */
public class P510A {

    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Integer n = Integer.valueOf(input[0]);
        Integer m = Integer.valueOf(input[1]);
        Integer sign = 1;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            }
            if (i % 2 == 1) {
                if (sign == 1) {
                    for(int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    System.out.print("#");
                    for(int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                }
                sign = -sign;
            }
            System.out.println();
        }
    }
}
