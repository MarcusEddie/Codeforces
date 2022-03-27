package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/1186/A
 * @author ey
 *
 */
public class P1186A {

    public static void main(String[] args) throws IOException{
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        String[] input = re.readLine().split(" ");
        Integer n = Integer.valueOf(input[0]);
        Integer m = Integer.valueOf(input[1]);
        Integer k = Integer.valueOf(input[2]);
        if (n.compareTo(m) <= 0 && n.compareTo(k) <= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
