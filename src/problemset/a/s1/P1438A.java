package problemset.a.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://codeforces.com/problemset/problem/1438/A
 * @author ey
 *
 */
public class P1438A {

    public static void main(String[] args) throws IOException{
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(io.readLine());
        List<String> rs = new ArrayList<String>();
        while (cnt > 0) {
            cnt--;
            Integer len = Integer.valueOf(io.readLine());
            if (len == 1) {
                rs.add("12");
            } else if (len == 2) {
                rs.add("12 24");
            } else {
                int sum = 0;
                for(int i = 1; i <= 100; i++) {
                    sum = len * i;
                    int times = len;
                    int diff = sum;
                    while (times > 1) {
                        times--;
                        
                    }
                }
            }
        }
//        System.out.println(doCheck("7 37 79 49 10"));
    }
    private static String gen() {
        String rs = "";
        return rs;
    }
    
    // 7 37 79 49
    private static boolean doCheck(String str) {
        boolean rs = true;
        String[] input = str.split(" ");
        int i = 0;
        int j = 2;
        int tmp = 0;
        int cnt = 0;
        while (true && j < input.length) {
            tmp = tmp + Integer.valueOf(input[i]);
            cnt++;
            if (cnt % j == 0) {
                if (tmp % j != 0) {
                    rs = false;
                    break;
                }
                i = i - (j - 2);
                tmp = Integer.valueOf(input[i]);
                cnt = 1;
            } else {

            }
            i++;
            if (i >= input.length) {
                i = 0;
                j++;
                tmp = 0;
                cnt = 0;
            }
        }

        return rs;
    }

}
