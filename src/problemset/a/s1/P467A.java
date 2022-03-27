package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://codeforces.com/problemset/problem/467/A
 */
public class P467A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        Integer rs = 0;
        while (cnt > 0) {
            String[] ith = br.readLine().split(" ");
            if (Integer.valueOf(Integer.valueOf(ith[0]) + 2).compareTo(Integer.valueOf(ith[1])) <= 0) {
                rs++;
            }
            cnt--;
        }
        System.out.println(rs);
    }
}
