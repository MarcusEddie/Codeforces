package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/330/A
 * @author ey
 *
 */
public class P330A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        String[] rc = io.readLine().split(" ");
        Integer r = Integer.valueOf(rc[0]);
        Integer c = Integer.valueOf(rc[1]);
        Integer xa = 0;
        Integer xb = 0;
        Integer ya = 0;
        Integer yb = 0;
        Integer sign =1;
        Boolean flag = true;
        for(int i = 0; i < r; i++) {
            String singleRow = io.readLine();
            if (singleRow.contains("S")) {
                flag = false;
                if (singleRow.indexOf("S") >= 0) {
                    if (singleRow.indexOf("S") != singleRow.lastIndexOf("S")) {
                        xa = i;
                        ya = i;
                        xb = singleRow.indexOf("S");
                        yb = singleRow.lastIndexOf("S");
                    } else {
                        if (sign > 0) {
                            xa = i;
                            xb = singleRow.indexOf("S");
                            sign = -sign;
                        } else {
                            ya = i;
                            yb = singleRow.indexOf("S");
                        }
                    }
                }
            }
        }
        if (flag) {
            System.out.println(r * c);
        } else {
            if (xa.compareTo(ya) == 0 || xb.compareTo(yb) == 0) {
                System.out.println(r * c -2);
            } else {
                System.out.println(r * c -4);
            }
        }
    }
}
