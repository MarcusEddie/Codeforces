package problemset.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1512/B
 * 
 * @author ey
 *
 */
public class P1512B {

    public static void main(String[] args) throws IOException {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer n = Integer.valueOf(io.readLine());
            Integer xa = 0;
            Integer xb = 0;
            Integer ya = 0;
            Integer yb = 0;
            int sign = 1;
            for (int i = 0; i < n; i++) {
                String input = io.readLine();
                if (input.contains("*") && (input.indexOf("*") == input.lastIndexOf("*"))) {
                    if (sign > 0) {
                        xa = i;
                        xb = input.indexOf("*");
                        sign = -sign;
                    } else {
                        ya = i;
                        yb = input.indexOf("*");
                    }
                } else if (input.contains("*") && (input.indexOf("*") != input.lastIndexOf("*"))) {
                    xa = i;
                    ya = i;
                    xb = input.indexOf("*");
                    yb = input.lastIndexOf("*");
                }
            }
            StringBuffer tmp = new StringBuffer();
            if (xa.compareTo(ya) == 0) {
                for (int i = 0; i < n; i++) {
                    int realRow = xa < n - 1 ? xa : xa - 1;
                    if (i != realRow + 1 && i != realRow) {
                        tmp.append(genSingleRow(n, -1, -1));
                    } else if (i == realRow) {
                        tmp.append(genSingleRow(n, xb, yb));
                    } else if (i == realRow + 1) {
                        tmp.append(genSingleRow(n, xb, yb));
                    }
                }
            } else if (xb.compareTo(yb) == 0) {
                for (int i = 0; i < n; i++) {
                    if (i == xa) {
                        if (xb < n - 1) {
                            tmp.append(genSingleRow(n, xb, xb + 1));
                        } else {
                            tmp.append(genSingleRow(n, xb, xb - 1));
                        }
                    } else if (i == ya) {
                        if (yb < n - 1) {
                            tmp.append(genSingleRow(n, yb, yb + 1));
                        } else {
                            tmp.append(genSingleRow(n, yb, yb - 1));
                        }
                    } else {
                        tmp.append(genSingleRow(n, -1, -1));
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (i == xa) {
                        tmp.append(genSingleRow(n, xb, yb));
                    } else if (i == ya) {
                        tmp.append(genSingleRow(n, yb, xb));
                    } else {
                        tmp.append(genSingleRow(n, -1, -1));
                    }
                }
            }
            rs.add(tmp.toString());

        }
        for (String string : rs) {
            System.out.print(string);
        }
    }

    private static String genSingleRow(Integer n, Integer xb, Integer yb) {
        StringBuffer rs = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if (i != xb && i != yb) {
                rs.append(".");
            } else {
                rs.append("*");
            }
        }
        rs.append("\n");
        return rs.toString();
    }
}
