package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/999/A
 */
public class P999A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = io.readLine().split(" ");
        Integer n = Integer.valueOf(nk[0]);
        Integer k = Integer.valueOf(nk[1]);
        String[] input = io.readLine().split(" ");
        Integer rs = 0;
        int i = 0;
        int j = input.length -1;
        boolean flag = true;
        boolean flagr = true;
        while (flag || flagr) {
            if ( i < input.length && Integer.valueOf(input[i]) <= k && i <= j) {
                i++;
                rs++;
            } else {
                flag = false;
            }
            if ( j >= 0 && Integer.valueOf(input[j]) <= k && i <= j) {
                j--;
                rs++;
            } else {
                flagr = false;
            }
        }
        System.out.println(rs);
    }

}
