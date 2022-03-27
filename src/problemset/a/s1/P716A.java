package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/716/A
 * @author ey
 *
 */
public class P716A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nc = io.readLine().split(" ");
        Integer n = Integer.valueOf(nc[0]);
        Integer c = Integer.valueOf(nc[1]);
        String[] input = io.readLine().split(" ");
        Integer rs = 0;
        if (n == 1) {
            rs = 1;
        } else {
            rs = 1;
            for (int i = 1; i < input.length; i++) {
                if(Integer.valueOf(input[i]) - Integer.valueOf(input[i - 1]) > c) {
                    rs = 1;
                } else {
                    rs++;
                }
            }
        }
        System.out.println(rs);
    }

}
