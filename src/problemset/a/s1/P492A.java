package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/492/A
 */
public class P492A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        Integer rs = 1;
        if (cnt.compareTo(1) == 0) {
            System.out.println(1);
        } else {
            while (cnt >= (((1 + rs) * rs) /2 )) {
                cnt = cnt - (((1 + rs) * rs) /2 );
                rs++;
            }
                System.out.println(rs - 1);
        }
    }

}
