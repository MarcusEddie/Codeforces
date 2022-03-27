package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/935/A
 */
public class P935A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        Integer rs = 1;
        if (cnt.compareTo(2) > 0) {
            for (int i = 2; i <= Math.sqrt(cnt); i++) {
                if (cnt % i == 0 && cnt / i != i) {
                    rs = rs + 2;
                }else if (cnt % i == 0 && cnt / i == i) {
                    rs = rs + 1;
                }
            }
        }
        System.out.println(rs);
    }

}
