package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/707/A
 * @author ey
 *
 */
public class P707A {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        String[][] pix = new String[Integer.valueOf(nm[0])][Integer.valueOf(nm[1])];
        Integer rows = 0;
        while (rows < Integer.valueOf(nm[0])) {
            pix[rows] = br.readLine().split(" ");
            rows++;
        }
        Boolean rs = true;
        for (int i = 0; i < pix.length; i++) {
            for (int j = 0; j < pix[i].length; j++) {
                if (pix[i][j].equals("C") || pix[i][j].equals("Y") || pix[i][j].equals("M")) {
                    rs = false;
                    break;
                }
            }
            if (!rs) {
                break;
            }
        }
        if (rs) {
            System.out.println("#Black&White");
        } else {
            System.out.println("#Color");
        }
    }

}
