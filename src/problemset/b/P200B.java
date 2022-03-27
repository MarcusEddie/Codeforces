package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * https://codeforces.com/problemset/problem/200/B
 * @author ey
 *
 */
public class P200B {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String[] vols = br.readLine().split(" ");
        Float rs = 0.0f;
        for (int i = 0; i < vols.length; i++) {
            rs = rs + Float.valueOf(vols[i]);
        }
        System.out.println(rs / cnt );
    }
}
