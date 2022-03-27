package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * https://codeforces.com/problemset/problem/1323/A
 */
public class P1323A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            String[] input = io.readLine().split(" ");
            int idx1 = -1;
            int idx2 = -1;
            for (int i = 0; i < input.length; i++) {
                if (Integer.valueOf(input[i]) % 2 == 0) {
                    idx1 = i + 1;
                    idx2 = i + 1;
                    break;
                }else {
                    if (idx1 == -1) {
                        idx1 = i + 1;
                    } else {
                        idx2 = i + 1;
                    }
                }
            }
            if (idx1 == idx2) {
                rs.add("1");
                rs.add(String.valueOf(idx1));
            } else if (idx2 == -1) {
                rs.add("-1");
            } else {
                rs.add("2");
                rs.add(String.valueOf(idx1) + " " + String.valueOf(idx2));
            }
        }
        for (String string : rs) {
            System.out.println(string);
        }
    }

}
