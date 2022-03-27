package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1513/A
 */
public class P1513A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            String[] nk = io.readLine().split(" ");
            Integer n = Integer.valueOf(nk[0]);
            Integer k = Integer.valueOf(nk[1]);
            if (n < 3 && k == 0) {
                String tmp = "1";
                for (int i = 1; i < n; i++) {
                    tmp = tmp + " " + (i + 1);
                }
                rs.add(tmp);
            } else if (n < 3 && k > 0) {
                rs.add("-1");
            } else if (n >= 3 && n <= k) {
                rs.add("-1");
            }  else if (n >= 3 && k == 0) {
                String tmp = "1";
                for (int i = 1; i < n; i++) {
                    tmp = tmp + " " + (i + 1);
                }
                rs.add(tmp);
            } else if (2 * k == n) {
                rs.add("-1");
            }else{
                int[] original = new int[n];
                int i = 0;
                int n1 = n;
                while (k > 0) {
                    if (i + 1< n) {
                        k--;
                        original[i + 1] = n1;
                    } else {
                        break;
                    }
                    n1--;
                    i = i + 2;
                    if (i >= n) {
                        break;
                    }
                }
                if (k != 0) {
                    rs.add("-1");
                } else {
                    i = 1;
                    for(int j = 0; j < original.length; j++) {
                        if (original[j] == 0) {
                            original[j] = i++;
                        }
                    }
                    String tmp = "";
                    for (int j = 0; j < original.length; j++) {
                        tmp = tmp + " " + String.valueOf(original[j]);
                    }
                    rs.add(tmp.substring(1));
                }
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }
}
